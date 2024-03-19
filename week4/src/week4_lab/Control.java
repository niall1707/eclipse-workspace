package week4_lab;

//Control.java
public class Control {
 public static void main(String[] args) {
     // Test Employee
     Employee employee = new Employee("John", "Doe", 12345, 60000);
     System.out.println("Employee Pay: " + employee.calculatePay());

     // Test HourlyEmployee
     HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Smith", 67890, 40, 20);
     System.out.println("Hourly Employee Pay: " + hourlyEmployee.calculatePay());

     // Test SalesEmployee
     SalesEmployee salesEmployee = new SalesEmployee("Alice", "Johnson", 54321, 50000, 5000);
     System.out.println("Sales Employee Pay: " + salesEmployee.calculatePay());
 }
}
