package MicroservicesDesignPattern.BehavioralDesignPatterns.MediatorMethodDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 5: Test the Mediator Pattern
		AirTrafficControl act = new ATCMediator();
		
		Aircraft plane1 = new PassengerPlane(act,"Flight 101");
		Aircraft plane2 = new CargoPlane(act,"Cargo 202");
		Aircraft plane3 = new PassengerPlane(act,"Flight 303");
		
		// Plane 1 sends a message
		plane1.sendMessage("Requesting landing clearance.");
		// Plane 2 sends a message
		plane2.sendMessage("Taxiing to runway.");

	}

}
//Step 2: Implement the Concrete Mediator (ATC)

class ATCMediator implements AirTrafficControl {
	private List<Aircraft> aircraftList = new ArrayList<>();
	
	public void registerAircraft(Aircraft aircraft) {
		aircraftList.add(aircraft);
	}
	public void sendMessage(String message,Aircraft sender) {
		// Do not send the message to the sender itself
		for(Aircraft aircraft:aircraftList) {
			// Do not send the message to the sender itself
			if(aircraft !=sender) {
				aircraft.receiveMessage(message);
			}
		}	
	}
}

//Step 3: Define the Colleague (Aircraft)
abstract class Aircraft {
	protected AirTrafficControl atc;
	protected String name;
	public Aircraft(AirTrafficControl atc,String name) {
		this.atc=atc;
		this.name=name;
		atc.registerAircraft(this);
	}
	public abstract void sendMessage(String message);
	public abstract void receiveMessage(String message);
}
//Step 4: Implement Concrete Aircraft Classes
class PassengerPlane extends Aircraft{
	public PassengerPlane(AirTrafficControl atc, String name) {
		super(atc,name);
	}
	public void sendMessage(String message) {
		System.out.println(name + " sending message : "+message);
		atc.sendMessage(message,this);
	}
	public void receiveMessage(String message) {
		System.out.println(name+" received message "+message);
	}
}
class CargoPlane extends Aircraft{
	public CargoPlane(AirTrafficControl atc,String name) {
		super(atc,name);
	}
	public void sendMessage(String message) {
		System.out.println(name+" Sending merssage : "+message);
		atc.sendMessage(message, this);
	}
	public void receiveMessage(String message) {
		System.out.println(name+" received merssage :"+message);
		
	}
}















