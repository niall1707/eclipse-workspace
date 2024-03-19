// SalesEmployee.java
package week4_lab;

public class SalesEmployee extends Employee {
    private double commissionEarned;

    public SalesEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned) {
        super(firstName, surName, staffNumber, annualSalary);
        this.commissionEarned = commissionEarned;
    }

    public double getCommissionEarned() {
        return commissionEarned;
    }

    public void setCommissionEarned(double commissionEarned) {
        this.commissionEarned = commissionEarned;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + commissionEarned;
    }
}
