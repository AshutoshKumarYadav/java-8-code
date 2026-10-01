package PracticeJava;

import java.util.ArrayList;

public class Car {
	public String name;
	public ArrayList<String> colors;
	public Car(String name,ArrayList<String> color) {
		this.name=name;
		this.colors=color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Honda car object
		ArrayList<String> hondacolor = new ArrayList<>();
		hondacolor.add("Red");
		hondacolor.add("Blue");
		Car honda = new Car("Honda",hondacolor);
		
		// Deep copy of Honda
		Car deepcopyHonda = new Car(
				honda.name,new ArrayList<>(honda.colors));
		deepcopyHonda.colors.add("Green");
		System.out.println("Deepcopy: ");
		for(String color:deepcopyHonda.colors) {
			System.out.println(color + " ");
		}
		System.out.println("\nOriginal: ");
		for(String color : honda.colors) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		// Shallow Copy of Honda
		Car copyHonda = honda;
		copyHonda.colors.add("Green");
		System.out.println("Shallow Copy: ");
		for(String color: copyHonda.colors) {
			System.out.print(color + " ");
		}
		System.out.println("\nOriginal: ");
		
		 for (String color : honda.colors) {
	            System.out.print(color + " ");
	        }
	        System.out.println();
		
		
		
		
	}

}
