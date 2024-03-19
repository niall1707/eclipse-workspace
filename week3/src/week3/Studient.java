package week3;

public class Studient {
    private int ID;
    private String Name;
    private String subject1;
    private String subject2;
    
    public Studient(int ID, String Name, String subject1, String subject2) {
        this.ID = ID;
        this.Name = Name;
        this.subject1 = subject1;
        this.subject2 = subject2;
    }
    
    // Getter for ID
    public int getID() {
        return ID;
    }
    
    // Setter for ID
    public void setID(int ID) {
        this.ID = ID;
    }
    
    // Getter for name
    public String getName() {
        return Name;
    }

    // Setter for name
    public void setName(String Name) {
        this.Name = Name;
    }
    
    // Getter methods for subjects
    public String getSubject1() {
        return subject1;
    }

    public String getSubject2() {
        return subject2;
    }
   
    // Method to print student details
    public void printDetails() {
        System.out.println("Student Name: " + Name);
        System.out.println("Student ID: " + ID);
        System.out.println("Enrolled Subjects: ");
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
    }
    
    public static void main(String[] args) {
        Studient student1 = new Studient(1, "Alice", "Mathematics", "Science");
        // Print student details
        student1.printDetails();
    }
}
