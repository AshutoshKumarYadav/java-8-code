package MicroservicesDesignPattern.CreationalDesignPatter.FactoryMethodDesignPattern;
//This pattern is typically helpful when it's necessary to separate the construction of an object from its implementation.
//With the use of this design pattern, objects can be produced without having to define the exact class of object to be created.
public class FactoryMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create notifications using the Factory Method
		Notification sms = NotificationFactory.createNotification("sms");
		sms.notifyUser();
		
		Notification email = NotificationFactory.createNotification("email");
		email.notifyUser();
		
		Notification push = NotificationFactory.createNotification("push");
		push.notifyUser();
	}

}
//Step 1: Create the Notification Interface
//Step 2: Implement Concrete Classes

// Concrete Product - SMS Notification
class SMSNotification implements Notification{
	public void notifyUser() {
		System.out.println("Sending an SMS Notification");
	}
}

//Concrete Product - Email Notification
class EmailNotification implements Notification{
	public void notifyUser() {
		System.out.println("Sending an Email Notification");
	}
}

//Concrete Product - Push Notification
class PushNotification implements Notification{
	public void notifyUser() {
		System.out.println("Sending an Push Notification");
	}
}

//Step 3: Create a Factory Class

// Factory class

class NotificationFactory{
	public static Notification createNotification(String type) {
		if(type==null || type.isEmpty()) {
			return null;
		}
		switch(type.toLowerCase()) {
		case "sms":
			return new SMSNotification();
		case "email":
			return new EmailNotification();
		case "push":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknow notification type :"+type);
		}
	}
}











