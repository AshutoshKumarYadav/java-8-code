package MicroservicesDesignPattern.StructuralDesignPatterns.FlyweightMethodDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 4: Use Flyweight Objects in Client Code
		
		// Using the factory to get trees
		Tree oak1 = TreeFactory.getTree("Oak");
		Tree oak2 = TreeFactory.getTree("Oak");
		Tree pine = TreeFactory.getTree("Pine");
		
		// Displaying trees at different positions
		oak1.display(10, 20);
		oak2.display(30, 40);
		pine.display(50, 60);
	}

}
//Step 2: Create Concrete Flyweight Class (SharedTree)

class SharedTree implements Tree{
	private final String type;// Common intrinsic state
	public SharedTree(String type) {
		this.type=type;
	}
	public void display(int x,int y) {
		System.out.println("Displaying a " + type + " tree at (" + x + ", " + y + ")");
	}
}

//Step 3: Create Flyweight Factory (TreeFactory)
//Flyweight Factory - Manages shared objects
class TreeFactory {
	private static final Map<String, Tree> treeMap = new HashMap<>();
	
	public static Tree getTree(String type) {
		if(!treeMap.containsKey(type)) {
			treeMap.put(type, new SharedTree(type));
			System.out.println("Creating new tree of type: "+type);
		}
		return treeMap.get(type);
	}
	
}

























