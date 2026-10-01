package PracticeJava.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a LinkedList
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// Adding elements to the LinkedList using add() method
		linkedList.add("five");
		linkedList.add("One");
		linkedList.add("two");
		linkedList.add("three");
		linkedList.add("four");
		linkedList.add(2, "Hello");
		linkedList.add(2, "Hello");
		linkedList.addFirst("Hello1");
		linkedList.addLast("Hello2");
		//linkedList.clear();
		System.out.println("linkedList1 : "+linkedList);
		linkedList.clone();
		
		System.out.println("linkedList2 : "+linkedList);
		
		System.out.println(linkedList.contains("Hello1"));
		linkedList.descendingIterator();
		System.out.println("linkedList3 : "+linkedList);
		//linkedList.element();
		System.out.println("linkedList4 : "+linkedList.element());
		System.out.println("linkedList5 : "+linkedList.get(0));
		System.out.println("linkedList5 : "+linkedList.getFirst());
		System.out.println("linkedList6 : "+linkedList.indexOf("Hello"));
		System.out.println("linkedList7 : "+linkedList.lastIndexOf("Hello"));
		ListIterator<String> ls = linkedList.listIterator(2);
		//System.out.println("linkedList7 : "+ls.next().indexOf(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
