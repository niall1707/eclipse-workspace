// Vehicle: Represents a vehicle.
// Author:
// Date:

package com.lab2.test;

public class vehicle {
    private String ownerName;
    private int registration;
    private int maxSpeed;
    private String color;
    private boolean automatic;
    private int numOfWheels;
    private boolean recentCar;

    // Constructor with some attributes
    public vehicle(String ownerName, int registration) {
        this.ownerName = ownerName;
        this.registration = registration;
    }

    // Second constructor with all attributes
    public vehicle(String ownerName, int registration, int maxSpeed, String color, boolean automatic, int numOfWheels) {
        this.ownerName = ownerName;
        this.registration = registration;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.automatic = automatic;
        this.numOfWheels = numOfWheels;
    }

    // toString method for a readable representation of attributes
    public String toString() {
        return "Owner Name: " + ownerName + ", Registration: " + registration
                + ", Max Speed: " + maxSpeed + ", Color: " + color
                + ", Automatic: " + (automatic ? "Yes" : "No") + ", Number of Wheels: " + numOfWheels;
    }

    // toString2 method indicating if the vehicle is old or new
    public String toString2() {
        return recentCar ? "This vehicle is new." : "This vehicle is old.";
    }

    // Set recentCar attribute based on registration year
    public void setRecentCar() {
        if (registration >= 2008) {
            recentCar = true;
        } else {
            recentCar = false;
        }
    }
}
