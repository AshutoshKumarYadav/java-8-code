package MicroservicesDesignPattern.BehavioralDesignPatterns.ObserverMethodDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the subject (news agency)
		NewsAgencyImpl newsAgency = new NewsAgencyImpl();
		
		// Create observers (subscribers)
		Observer tvChannel = new TVChannel("CNN");
		Observer mobileApp = new MobileApp("NewsApp");
		
		// Subscribe observers to the news agency
		newsAgency.subscribe(tvChannel);
		newsAgency.subscribe(mobileApp);
		
		// Publish news updates
		newsAgency.publishNews("Breaking: Observer Pattern Explained!");
		newsAgency.publishNews("Update: Java 21 Released!");
		
		// Unsubscribe one observer
		newsAgency.unsubscribe(tvChannel);
		
		// Publish another news update
		newsAgency.publishNews("Exclusive: AI is transforming the world!");
		
	}

}
//Step 3: Implement the Concrete Subject (News Agency)
class NewsAgencyImpl implements NewsAgency {
	private List<Observer> observers  = new ArrayList<>();
	
	public void subscribe(Observer observer) {
		observers.add(observer);
	}
	public void unsubscribe(Observer observer) {
		observers.remove(observer);	
	}
	public void notifyObservers(String news) {
		
		for(Observer observer : observers) {
			observer.update(news);
		}
		
	}
	 // Method to publish news
	public void publishNews(String news) {
		System.out.println("News Published: " + news);
		notifyObservers(news);
	}
	
	
	
	
}
//Step 4: Implement the Concrete Observers (Subscribers)
class TVChannel implements Observer{
	private String name;
	
	public TVChannel(String name) {
		this.name=name;
	}
	
	public void update(String news) {
		System.out.println(name + " broadcasting: " + news);
	}
	
}
class MobileApp implements Observer{
	private String name;
	
	public MobileApp(String name) {
		this.name=name;
	}
	public void update(String news) {
		System.out.println(name + " broadcasting: " + news);
	}
}



















