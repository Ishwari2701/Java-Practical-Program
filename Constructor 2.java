import java.util.Scanner;

class Employee {

    int id;
    String name;
    double salary;

    // Default Constructor
    Employee() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
    }

    // Constructor with Name only
    Employee(String name) {
        this.id = 0;
        this.name = name;
        this.salary = 0.0;
    }

    // Constructor with Name and Salary
    Employee(String name, double salary) {
        this.id = 0;
        this.name = name;
        this.salary = salary;
    }

    // Constructor with All Details
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display Method
    void display() {
        System.out.println("\n------ Employee Details ------");
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Annual Salary : " + (salary * 12));
    }
}

public class Constructor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e;

        System.out.println("===== Constructor Overloading Menu =====");
        System.out.println("1. Default Constructor");
        System.out.println("2. Constructor with Name");
        System.out.println("3. Constructor with Name and Salary");
        System.out.println("4. Constructor with All Details");
        System.out.print("Enter your choice: ");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {

            case 1:
                e = new Employee();
                e.display();
                break;

            case 2:
                System.out.print("Enter Employee Name: ");
                String name1 = sc.nextLine();

                e = new Employee(name1);
                e.display();
                break;

            case 3:
                System.out.print("Enter Employee Name: ");
                String name2 = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                e = new Employee(name2, salary);
                e.display();
                break;

            case 4:
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name3 = sc.nextLine();

                System.out.print("Enter Salary: ");
                double sal = sc.nextDouble();

                e = new Employee(id, name3, sal);
                e.display();
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

