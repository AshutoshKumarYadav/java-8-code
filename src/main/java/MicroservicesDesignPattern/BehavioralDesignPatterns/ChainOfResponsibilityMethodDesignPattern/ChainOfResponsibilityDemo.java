package MicroservicesDesignPattern.BehavioralDesignPatterns.ChainOfResponsibilityMethodDesignPattern;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 3: Set Up and Test the Chain
		//In the client code, create the chain of handlers. Each handler is set to pass requests along if it cannot process them.
		 // Create handlers
		Handler handler1 = new ConcreteHandlerA();
		Handler handler2 = new ConcreteHandlerB();
		Handler defaultHandler = new DefaultHandler();
		// Set up chain: handlerA -> handlerB -> defaultHandler
		handler1.setNext(handler2);
		handler2.setNext(defaultHandler);
		
		// Test with various requests
		System.out.println("Request: Request contains A");
		handler1.handleRequest("This request contains A");
		
		System.out.println("\nRequest: Request contains B");
		handler1.handleRequest("This request contains B");
		
		System.out.println("\nRequest: Request without specific letter");
		handler1.handleRequest("This request contains A or B");
		
	}

}
//Step 2: Create Concrete Handlers
//Each concrete handler checks if it can process the request. If not, it passes the request to the next handler.
class ConcreteHandlerA implements Handler{
	private Handler nextHandler;
	
	public void setNext(Handler next ) {
		this.nextHandler=next;
	}
	public void handleRequest(String request) {
		if(request.contains("A")) {
			System.out.println("ConcreteHandlerA handled the request: " + request);
		}else if(nextHandler !=null) {
			nextHandler.handleRequest(request);
		}else {
			System.out.println("No handler available for: " + request);
		}
	}
}

class ConcreteHandlerB  implements Handler{
private Handler nextHandler;

public void setNext(Handler next) {
	this.nextHandler=next;
}
public void handleRequest(String request) {
	if(request.contains("B")) {
		 System.out.println("ConcreteHandlerB handled the request: " + request);
	}else if(nextHandler!=null){
		nextHandler.handleRequest(request);
	}else {
		System.out.println("No handler available for: " + request);
	}
}
}

class DefaultHandler implements Handler{
	public void setNext(Handler next) {
		
	}
	public void handleRequest(String request) {
		System.out.println("DefaultHandler: No specific handler found for: " + request);
	}
}























