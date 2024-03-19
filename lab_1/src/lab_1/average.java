package lab_1;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        // Create a Scanner object to read inputs from the user
        Scanner reader = new Scanner(System.in);
        
        // Print prompt statements to instruct the user
        System.out.print("Enter the first number: ");
        // Read the entered integer and store it into an integer variable
        int num1 = reader.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = reader.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = reader.nextInt();
        
        // Calculate the average
        int average = (num1 + num2 + num3) / 3;
        
        // Print the average on the screen
        System.out.println("The average of the three numbers is: " + average);
        
        // Close the scanner to prevent resource leak
        reader.close();
    }
}
