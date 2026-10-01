package MicroservicesDesignPattern.BehavioralDesignPatterns.CommandMethodDesignPattern;

public class CommandPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a receiver
		Light livingRoomLight = new Light();
		
		// Create concrete commands
		Command ligghtOn = new LightOnCommand(livingRoomLight);
		Command ligghtOff = new LightOffCommand(livingRoomLight);
		
		// Create invoker and execute commands
		RemoteControl remote = new RemoteControl();
		// Turn the light on
		remote.setCommand(ligghtOn);
		System.out.println("Pressing button to turn the light on:");
		remote.pressButton();
		
		// Turn the light off
		remote.setCommand(ligghtOff);
		System.out.println("Pressing button to turn the light off:");
		remote.pressButton();
		
	}

}
//2. Receiver Class
//The receiver contains the business logic that will be executed.
	class Light{
		public void lightTurnOn() {
			System.out.println("The light is ON");
		}
		public void lightTurnOff() {
			System.out.println("The light is OFF");
		}
	}

	
	//3. Concrete Commands
	//Concrete commands implement the Command interface and call methods on the receiver.
	
	class LightOnCommand implements Command{
		private Light light;
		public LightOnCommand(Light light) {
			this.light=light;
		}
		public void excute() {
			light.lightTurnOn();
		}
	}
	
	class LightOffCommand implements Command{
		private Light light;
		public LightOffCommand(Light light) {
			this.light=light;
		}
		public void excute() {
			light.lightTurnOff();
		}
	}
	//4. Invoker Class
	//The invoker stores a command and at some point asks the command to execute the request.
	class RemoteControl{
	private Command command;
	// Set a command at runtime
	public void setCommand(Command command) {
		this.command=command;
	}
	
	// Execute the stored command
	public void pressButton() {
		command.excute();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	