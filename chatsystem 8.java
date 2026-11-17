class ChatUser extends Thread {
    boolean running = true;
    boolean suspended = false;

    ChatUser(String name) {
        super(name);
    }

    public synchronized void suspendUser() {
        suspended = true;
        System.out.println(getName() + " suspended");
    }

    public synchronized void resumeUser() {
        suspended = false;
        notifyAll();
        System.out.println(getName() + " resumed");
    }

    public void terminateUser() {
        running = false;
        interrupt();
        System.out.println(getName() + " terminated");
    }

    public void sendMessage(ChatUser user, String message, boolean important) {
        if (important) {
            user.setPriority(Thread.MAX_PRIORITY);
        }

        System.out.println(getName() + " -> " + user.getName() + ": " + message);
    }

    public void run() {
        try {
            while (running) {
                synchronized (this) {
                    while (suspended && running) {
                        wait();
                    }
                }

                if (running) {
                    System.out.println(getName() + " is ready to chat");
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " thread interrupted");
        }
    }
}

public class chatsystem {
    public static void main(String[] args)
            throws InterruptedException {

        ChatUser alice = new ChatUser("Alice");
        ChatUser bob = new ChatUser("Bob");
        ChatUser charlie = new ChatUser("Charlie");

        alice.start();
        bob.start();
        charlie.start();
        Thread.sleep(1000);

        //Send message
        alice.sendMessage(bob, "HelloBob!", false);
        bob.sendMessage(charlie, "Important", true);

        System.out.println("Alice alive:" + alice.isAlive());
        System.out.println("Bob alive:" + bob.isAlive());

        //Suspend and resume
        charlie.suspendUser();
        Thread.sleep(1000);
        charlie.resumeUser();

        //Terminate threads
        alice.terminateUser();
        bob.terminateUser();
        charlie.terminateUser();

        //wait for thread to finish
        alice.join();
        bob.join();
        charlie.join();
        System.out.println("All threads finished:");
    }
}