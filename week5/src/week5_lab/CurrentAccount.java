package week5_lab;


public class CurrentAccount {

	double penaltyAmount;
	String Warning;
	String checkCredit;
	
	// Constructor
	public CurrentAccount(String warning) {
	    this.Warning = warning;
	}

    
    // Getter 
    public String getWarning() {
        return Warning;
    }
    
    // Setter 
    public void setWarning(String Warning) {
        this.Warning = Warning;
    }
    
    public static void main(String[] args) 
    {
    	CurrentAccount Account1 = new CurrentAccount("you are in credit!");
    	System.out.println(Account1.getWarning());
    }
}

