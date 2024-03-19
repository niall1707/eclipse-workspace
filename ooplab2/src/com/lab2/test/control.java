
//Control: This class is used to run the Java code.
//Author:
//Date:

package com.lab2.test;

public class control {
 public static void main(String[] args) {
     System.out.println("Hello, World!");

     // Create a Vehicle object using the first constructor
     vehicle myCar1 = new vehicle("John Doe", 12345);

     // Create another Vehicle object using the second constructor
     vehicle myCar2 = new vehicle("Jane Smith", 67890, 200, "Red", false, 4);

     // Print the vehicles using toString method
     System.out.println(myCar1.toString());
     System.out.println(myCar2.toString());

     // Set recentCar attribute and print using toString2 method
     myCar1.setRecentCar();
     myCar2.setRecentCar();
     System.out.println(myCar1.toString2());
     System.out.println(myCar2.toString2());
 }
}
