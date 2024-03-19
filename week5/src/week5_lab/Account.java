package week5_lab;
import java.util.Scanner;

public class Account {
    String accountName;
    int accountNumber;
    Boolean inCredit;
    double acctBalance;
    double newBal;
    double depAmount ;
    double takeAmount;
    int num;

    // Constructor
    public Account(String accountName) {
        this.accountName = accountName;
        this.acctBalance = 100.0;
        this.num = 1234;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter how much you would like to deposit:");
                    this.depAmount = scanner.nextDouble(); // Parse user input as a double
                    this.newBal = depAmount + newBal + acctBalance;
                    System.out.println("Deposited $" + depAmount);
                    break;
                case 2:
                    System.out.println("Enter how much you would like to withdraw:");
                    this.takeAmount = scanner.nextDouble(); // Parse user input as a double
                    if (takeAmount > newBal) {
                        System.out.println("\nYou do not have the funds\n");
                    } else {
                        this.newBal = depAmount  + acctBalance - takeAmount;
                        System.out.println("Withdrawn $" + takeAmount);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (this.newBal < 0);

    }

    // Getter 
    public String getAccountName() {
        return accountName;
    }

    // Setter 
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public static void main(String[] args) {
        Account Account1 = new Account("Niall's Account");
        System.out.println("Account number: " + Account1.num);
        System.out.println("Account Name: " + Account1.getAccountName());
        System.out.println("Account Balance: $" + Account1.acctBalance);
        System.out.println("The updated Account Balance is: $" + Account1.newBal);
    }
}

