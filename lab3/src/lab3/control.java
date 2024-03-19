package lab3;

import java.util.Scanner;

public class control {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 3rd animal's name: ");
        String animalName = scanner.nextLine();

        // Create instances of Animal using the constructor with all attributes
        Animal animal1 = new Animal("Fluffy", "Dog", "Lab", false, true);
        Animal animal2 = new Animal("Guardian", "Bird", "Crow", false, false);
        Animal animal3 = new Animal(animalName, "Frog", "A green one", false, true);

        // Print out details of each animal
        animal1.printDetails();
        animal1.makeSound();
        System.out.println();
        animal2.printDetails();
        animal2.makeSound();
        System.out.println();
        animal3.printDetails();
        animal3.makeSound();

        scanner.close();
    }
}
