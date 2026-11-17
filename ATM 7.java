import java.util.Scanner;

public class ATM {
    private double balance = 10000;

    public void checkBalance() {
        System.out.println("Current Balance rupees: " + balance);
    }

    public void deposite(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposite amount must be greater than zero");
        }
        balance += amount;
        System.out.println("rupees " + amount + " deposited successfully");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be greater than zero");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient funds in account");
        }
        balance -= amount;
        System.out.println("rupees " + amount + " withdraw successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            System.out.println("\n------- ATM Menu -------");
            System.out.println("1. Check balance");
            System.out.println("2. Deposite money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int Choice = sc.nextInt();
                switch (Choice) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        atm.deposite(sc.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        atm.withdraw(sc.nextDouble());
                        break;
                    case 4:
                        System.out.println("Thank You For Using ATM");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input: ");
                sc.nextLine();
            } finally {
                System.out.println("Transaction process completed");
            }
        }
    }
}