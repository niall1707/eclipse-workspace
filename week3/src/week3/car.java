package week3;
import java.util.Scanner;

public class car {
    private String make;
    private String model;
    private int registrationYear;

    // Constructor to initialize using user input
    public car() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car make:");
        this.make = scanner.nextLine();
        System.out.println("Enter car model:");
        this.model = scanner.nextLine();
        System.out.println("Enter car registration year:");
        this.registrationYear = scanner.nextInt();
    }

    // Method to print car details
    public void printDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Registration Year: " + registrationYear);
    }

    public static void main(String[] args) {
        car car1 = new car(); // Create a car object using user input
        // Print car details
        car1.printDetails();
    }
}
