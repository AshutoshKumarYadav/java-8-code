package OOPSConcept;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Encapsulation means binding data (variables) and code (methods) together while restricting direct access to the data.
		
		// Test Encapsulation
		
		BankAccount account=new BankAccount(1000);
		System.out.println("Current Balance: $" + account.getBalance());
		account.deposite(500);
		System.out.println("Updated Balance: $" + account.getBalance());

	}

}
class BankAccount{
	private double balance;// Private variable (data hiding)
	// Constructor
	public BankAccount (double balance) {
		this.balance=balance;
	}
	// Getter method to access private data
	public double getBalance() {
		return balance;
	}
	// Setter method to modify private data
	public void deposite(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("Deposited: $" + amount);
		}else {
			System.out.println("Invalid deposit amount!");
		}
	}
}







