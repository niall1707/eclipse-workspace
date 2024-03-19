// Employee.java
package week4_lab;

public class Employee {
    private String firstName;
    private String surName;
    private int staffNumber;
    private double annualSalary;

    public Employee(String firstName, String surName, int staffNumber, double annualSalary) {
        this.firstName = firstName;
        this.surName = surName;
        this.staffNumber = staffNumber;
        this.annualSalary = annualSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculatePay() {
        return annualSalary / 12;
    }

    
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", staffNumber=" + staffNumber +
                ", annualSalary=" + annualSalary +
                '}';
    }
}
