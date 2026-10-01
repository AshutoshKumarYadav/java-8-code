package PracticeJava.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class List {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an Array of string type
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> all = new ArrayList<>();
		
		all.add("ARaj");
		all.add("BRaj");
		all.add("Ashutosh");
		// Adding elements to ArrayList
		al.add("Ashutosh");
		al.add("Raj Kumar");
		
		//System.out.println("Original list"+al);
		
		// Adding Elements at the specifica
		al.add(1, "Ashutosh 1");
		//System.out.println("Modified list"+al);
		
		// Removing Element using index
		al.remove(0);
		//System.out.println("removed element from list"+al);
		
		// Removing Element using the value
		al.remove("Ashutosh 1");
		//System.out.println("removed element from list"+al);
		
		//Updating value at index 0
		al.set(0, "Ashutosh");
		//System.out.println("removed element from list"+al);
		
		System.out.println("****************************************************");
		
		al.addAll(all);
		System.out.println("*************** "+al);
		al.addAll(2, all);
		System.out.println("*************** "+al);
		
		//al.clear();
		//System.out.println("*************** "+al);
		al.clone();
		System.out.println("*************** "+al);
		//al.contains(all.equals("Ashutosh"));
		System.out.println("*************** "+al.contains("Ashutosh"));
		
		
		// Preallocate capacity for 7 elements
		ArrayList<String> srt = new ArrayList<>();
		srt.ensureCapacity(5);
		srt.add("as");
		srt.add("sd");
		srt.add("ek");
		srt.add("cg");
		srt.add("sh");
		srt.add("Hello");
		System.out.println(srt);
		srt.forEach(System.out::print);
		//srt.indexOf(3);
		ArrayList<String> srt1 = new ArrayList<>();
		System.out.println(srt.indexOf("Hello"));
		System.out.println(srt1.isEmpty());
		ListIterator<String> i = al.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		srt.removeIf(x->"cg".equals(x));
		System.out.println(srt);
		srt.toArray();
		Object[] object = srt.toArray();
		for(Object obj:object) {
			System.out.print(obj + " ");
		}
		
		
		
		
		
		
		
	}

}














