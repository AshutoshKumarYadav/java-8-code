package MicroservicesDesignPattern.StructuralDesignPatterns.FacadeMethodDesignPattern;

public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 3: Use the Facade in Client Code
		// Creating Subsystem Components
		TV tv = new TV();
		SoundSystem soundsystem = new SoundSystem();
		DVDPlayer dvdplayer = new DVDPlayer();
		// Creating Facade
		HomeTheaterFacade hometheater = new HomeTheaterFacade(tv,soundsystem,dvdplayer);
		// Using Facade to simplify interactions
		hometheater.watchMovie("Inception");
		hometheater.stopMovie();
		
	}

}
//Step 1: Create Subsystem Classes
//Subsystem Class 1 - TV
class TV{
	public void turnOn() {
		System.out.println("Turn On the TV");
	}
	public void turnOff() {
		System.out.println("Turn Off the TV");
	}
}
//Subsystem Class 2 - Sound System
class SoundSystem{
	public void setVolume(int level) {
		System.out.println("Setting volume to : "+level);
	}
}

//Subsystem Class 3 - DVD Play
class DVDPlayer {
	public void playMovie(String movie) {
		System.out.println("Playing Movie "+movie);
	}
	public void stopMovie() {
		System.out.println("Stopping the movie ");
		
	}
}

//Step 2: Create the Facade Class (HomeTheaterFacade)

class HomeTheaterFacade {
	private TV tv;
	private SoundSystem soundsystem;
	private DVDPlayer dvdplayer;
	
	public HomeTheaterFacade(TV tv,SoundSystem soundsystem,DVDPlayer dvdplayer) {
		this.tv=tv;
		this.soundsystem=soundsystem;
		this.dvdplayer=dvdplayer;
		
	}
	
	// Simplified method to watch a movie
	public void watchMovie(String movie) {
		System.out.println("\nSetting up home theater :");
		tv.turnOn();
		soundsystem.setVolume(10);
		dvdplayer.playMovie(movie);
		System.out.println("\n Enjoy your movie");
	}
	// Simplified method to stop the movie
	public void stopMovie() {
		System.out.println("\n Shutting down home theater :");
		dvdplayer.stopMovie();
		tv.turnOff();
		System.out.println("Good bye!\n");
	}
	
	
	
}

























