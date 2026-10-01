package MicroservicesDesignPattern.BehavioralDesignPatterns.StateMethodDesignPattern;

public class StatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 4: Test the State Pattern
		TrafficLight trafficLight = new TrafficLight();
		// Cycle through states
		trafficLight.changeLight();// Red → Green
		trafficLight.changeLight();// Green → Yellow
		trafficLight.changeLight();// Yellow → Red
		trafficLight.changeLight();// Red → Green (repeat)
	}

}
//Step 2: Implement Concrete States (Red, Green, Yellow)
class RedLightState implements TrafficLightState{
	public void handleRequest(TrafficLight trafficLight) {
		System.out.println("Red Light - Stop!");
		trafficLight.setState(new GreenLightState());// Transition to Green
	}
}

class GreenLightState implements TrafficLightState{
	public void handleRequest(TrafficLight trafficLight) {
		System.out.println("Green Light - Go!");
		trafficLight.setState(new YellowLightState());// Transition to Yellow
	}
}
class YellowLightState implements TrafficLightState {
	public void handleRequest(TrafficLight trafficLight) {
		System.out.println("Yellow Light - Slow Down!");
		trafficLight.setState(new RedLightState());// Transition to Red
	}
}
//Step 3: Implement the Context Class (Traffic Light)
class TrafficLight {
	private TrafficLightState state;
	public TrafficLight() {
		this.state=new RedLightState();// Default state
	}
	public void setState(TrafficLightState state) {
		this.state=state;
	}
	public void changeLight() {
		state.handleRequest(this);
	}
}













