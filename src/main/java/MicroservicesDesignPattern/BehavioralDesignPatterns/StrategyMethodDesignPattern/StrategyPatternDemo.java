package MicroservicesDesignPattern.BehavioralDesignPatterns.StrategyMethodDesignPattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 4: Test the Strategy Pattern
		ShoppingCart cart = new ShoppingCart();
		// Pay using Credit Card
		cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
		cart.checkout(100);
		
		// Pay using PayPal
		cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
		cart.checkout(200);
		
		// Pay using Bitcoin
		cart.setPaymentStrategy(new BitcoinPayment("1A2B3C4D5E6F"));
		cart.checkout(300);
		
		cart.setPaymentStrategy(new BitcoinPayment(""));
		cart.checkout(300);
	}

}
//Step 2: Implement Concrete Strategies (Credit Card, PayPal, Bitcoin)
class CreditCardPayment implements PaymentStrategy {
	private String cardNumber;
	
	public CreditCardPayment(String cardNumber) {
		this.cardNumber=cardNumber;
	}
	public void pay(int amount) {
		System.out.println("Paid $" + amount + " using Credit Card (Card Number: " + cardNumber + ")");
	}
}
class PayPalPayment implements PaymentStrategy{
	private String email;
	
	public PayPalPayment(String email) {
		this.email=email;
	}
	public void pay(int amount) {
		System.out.println("Paid $" + amount + " using PayPal (Email: " + email + ")");
	}
	
}
class BitcoinPayment  implements PaymentStrategy{
	private String walletAddress;
	public BitcoinPayment(String walletAddress) {
		this.walletAddress=walletAddress;
	}
	public void pay(int amount) {
		System.out.println("Paid $" + amount + " using Bitcoin (Wallet Address: " + walletAddress + ")");
	}
}
//Step 3: Implement the Context Class (Shopping Cart)
class ShoppingCart {
	private PaymentStrategy paymentStrategy;
	// Set payment strategy at runtime
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy=paymentStrategy;
	}
	// Perform payment using the selected strategy
	public void checkout(int amount) {
		 if(paymentStrategy==null) {
			 System.out.println("No payment method selected!");
		 }else {
			 paymentStrategy.pay(amount);
		 }
	}
}











































