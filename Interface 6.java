import java.util.Scanner;

interface Academic {
    void storeAcademicDetails();
    void displayAcademicDetails();
}

interface Sports {
    void storeSportsDetails();
    void displaySportsDetails();
}

class Student implements Academic, Sports {

    String name = "Ishwari Rahane";
    int rollNo = 272;
    float percentage;
    String sportName;

    Scanner sc = new Scanner(System.in);

    // Store Academic Details
    public void storeAcademicDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);

        System.out.println("Enter Academic Percentage: ");
        percentage = sc.nextFloat();
        sc.nextLine();
    }

    // Display Academic Details
    public void displayAcademicDetails() {
        System.out.println("\n---- Academic Details ----");
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Academic Percentage: " + percentage + "%");
    }

    // Store Sports Details
    public void storeSportsDetails() {
        System.out.println("Enter Sports Name: ");
        sportName = sc.nextLine();
    }

    // Display Sports Details
    public void displaySportsDetails() {
        System.out.println("\n---- Sports Details ----");
        System.out.println("Sports Name: " + sportName);
    }
}

public class Interface {
    public static void main(String[] args) {

        Student s = new Student();

        s.storeAcademicDetails();
        s.storeSportsDetails();

        s.displayAcademicDetails();
        s.displaySportsDetails();
    }
}