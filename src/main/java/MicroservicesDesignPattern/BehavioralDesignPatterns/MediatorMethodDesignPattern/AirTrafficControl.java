package MicroservicesDesignPattern.BehavioralDesignPatterns.MediatorMethodDesignPattern;
//Step 1: Define the Mediator Interface
public interface AirTrafficControl {
	void registerAircraft(Aircraft aircraft);
	void sendMessage(String message,Aircraft sender);	
	
}
