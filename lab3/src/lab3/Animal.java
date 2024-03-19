package lab3;
import java.util.Scanner;

public class Animal {
     String name; 
     String type; 
     String breed;
     boolean fictional; 
     boolean domestic; 
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Constructor
    public Animal(String name, String type, String breed, boolean fictional, boolean domestic)
    {
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.fictional = fictional;
        this.domestic = domestic;
    }
    
    //Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String Name) {
        this.name = name;
    }
    
    // Method to print student details
    public void printDetails() {
        System.out.println("aminal name: " + name);
        System.out.println("animal type: " + type);
        System.out.println("animal breed " + breed);
        System.out.println("is it fictional? " + fictional);
        System.out.println("is it domestic? " + domestic);
    }
    
    public void makeSound() {
        if (type.equalsIgnoreCase("dog")) {
            System.out.println("Bark");
        } else if (type.equalsIgnoreCase("cat")) {
            System.out.println("Meow");
        } else if (type.equalsIgnoreCase("bird")) {
            System.out.println("Tweet");
        } else if (type.equalsIgnoreCase("frog")) {
            System.out.println("ribet");
        } else if (type.equalsIgnoreCase("horse")) {
            System.out.println("Neigh");
        } else {
            System.out.println("Unknown animal type. Cannot make sound.");
        }
    }
    

    
}
