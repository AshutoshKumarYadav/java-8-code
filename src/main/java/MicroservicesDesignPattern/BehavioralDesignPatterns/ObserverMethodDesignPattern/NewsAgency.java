package MicroservicesDesignPattern.BehavioralDesignPatterns.ObserverMethodDesignPattern;


//Step 2: Define the Subject Interface
//Subject interface
public interface NewsAgency {
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	void notifyObservers(String news);
}
