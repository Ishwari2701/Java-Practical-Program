import java.util.Scanner;

// Base Class
class Product {

    int productId;
    String name;
    double price;

    // Method to accept common product details
    void acceptProductDetails(Scanner sc) {

        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        name = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    // Method to display common product details
    void displayProductDetails() {

        System.out.println("\n----- Product Details -----");
        System.out.println("Product ID : " + productId);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
    }
}

// Derived Class Electronics
class Electronics extends Product {

    String brand;
    int warranty;

    void acceptElectronicDetails(Scanner sc) {

        acceptProductDetails(sc);
        sc.nextLine();

        System.out.print("Enter Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Warranty (in years): ");
        warranty = sc.nextInt();
    }

    void displayElectronicDetails() {

        displayProductDetails();
        System.out.println("Brand : " + brand);
        System.out.println("Warranty : " + warranty + " Years");
    }
}

// Derived Class Clothing
class Clothing extends Product {

    String size;
    String material;

    void acceptClothingDetails(Scanner sc) {

        acceptProductDetails(sc);
        sc.nextLine();

        System.out.print("Enter Size: ");
        size = sc.nextLine();

        System.out.print("Enter Material: ");
        material = sc.nextLine();
    }

    void displayClothingDetails() {

        displayProductDetails();
        System.out.println("Size : " + size);
        System.out.println("Material : " + material);
    }
}

// Main Class
public class ProductManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Electronics e = new Electronics();
        Clothing c = new Clothing();

        System.out.println("===== Enter Electronics Details =====");
        e.acceptElectronicDetails(sc);

        System.out.println("\n===== Enter Clothing Details =====");
        c.acceptClothingDetails(sc);

        System.out.println("\n===== Electronics Details =====");
        e.displayElectronicDetails();

        System.out.println("\n===== Clothing Details =====");
        c.displayClothingDetails();

        sc.close();
    }
}