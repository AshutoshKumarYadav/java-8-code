package solidPrinciple;

public class OpenClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Payment pay = new Payment(5000.0);
		CreditCradPayment credit = new CreditCradPayment();
		credit.pay(5000.0);
		PayPalPayment paypal = new PayPalPayment();
		paypal.pay(1000);
	}

}
 abstract class Payment{
	public abstract void pay(double amount);
}
 
class CreditCradPayment extends Payment{
	public void pay(double amount) {
	System.out.println("****** Paid : "+amount);	
	}
}
class PayPalPayment extends Payment{
	public void pay(double amount) {
		System.out.println("******** PayPalPayment : "+amount);
	}
}
