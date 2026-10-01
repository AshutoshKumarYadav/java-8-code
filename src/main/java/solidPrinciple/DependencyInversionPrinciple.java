package solidPrinciple;

public class DependencyInversionPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentServices ps = new PaymentServices(new CreditCard());
		ps.processPayment(5000);
		PaymentServices pl = new PaymentServices(new PayPal());
		pl.processPayment(1000);
	}

}
class CreditCard implements PaymentMethod{
	public void makePayment(double amount) {
		System.out.println("******** CreditCard amount : "+amount);
	}
}
class PayPal implements PaymentMethod{
	public void makePayment(double amount) {
		System.out.println("******** PayPal amount : "+amount);
	}
}

class PaymentServices {
	private PaymentMethod paymentMethod;
	public PaymentServices(PaymentMethod paymentMethod) {
		this.paymentMethod=paymentMethod;
	}
	public void processPayment(double amount) {
		paymentMethod.makePayment(amount);
	}
}