package PracticeJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class TraversingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listVallue = new ArrayList<>();
		listVallue.add("Ashutosh");
		listVallue.add("Rahul");
		listVallue.add("singum");
		listVallue.add("Hello");
		//System.out.println("************** "+listVallue.get(3));
		for(int i=0;i<listVallue.size();i++) {
			//System.out.println("************** "+listVallue.get(i));
		}
		String temp;
		for(int j=listVallue.size()-1;j>=0;j--) {
			//System.out.println("************** "+listVallue.get(j));
			temp = listVallue.get(j);
			
		}
		System.out.println("************** ArrayList start ****************************");
		// Using ArrayList
		List<Integer> arrlist = new ArrayList<>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		arrlist.add(50);
		System.out.println("ArrayList : "+arrlist);
		System.out.println("************** Linked List****************************");
		// Using LinkedList
		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		System.out.println("linkedList : "+linkedList);
		// Insert at the beginning
		arrlist.add(0, 10);// Slow, O(n)
		linkedList.add(0, 10);// Fast, O(1)
		
		//System.out.println("ArrayList : "+arrlist);
		//System.out.println("linkedList : "+linkedList);
		
		// Remove an element from the middle
		arrlist.remove(2);// Slow, O(n)
		linkedList.remove(2);// Fast, O(1) if reference is known
		
		// Access an element
		//System.out.println("Element at index 1 in ArrayList: " + arrlist.get(1));  // Fast O(1)
        //System.out.println("Element at index 1 in LinkedList: " + linkedList.get(1)); // Slow O(n)
        
        //System.out.println("*************************Vector List***********************************************************");
        
        Vector<String> vector = new Vector<>();
        vector.add("Ashu");
        vector.add("light");
        
        vector.add(0, "ashu1");
        vector.addAll(vector);
        vector.addAll(0, vector);
        vector.addElement("Hello");
        //System.out.println("******************************"+vector);
        //System.out.println("******************************"+vector.get(2));
		
        
        //System.out.println("****************************** Stack ********");
        
     // Create a Stack
        Stack<Integer> stack = new Stack<>();
     // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushing elements: " + stack);  
     // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element using peek(): " + topElement);
     // Pop an element from the stack   
        int popElement = stack.pop();
        System.out.println("Popped element: " + popElement);
     // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
        
     // Search for an element (returns 1-based position from the top, or -1 if not found)   
        int position = stack.search(20);
        System.out.println("Position of element 20 from the top: " + position);
        
     // Create a PriorityQueue of Integers (natural ordering - smallest element has highest priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
     // Adding elements to the PriorityQueue
        pq.offer(20);
        pq.offer(15);
        pq.offer(10);
        pq.offer(10);
        pq.offer(5);
        
        // Peek at the element with the highest priority (smallest element)
        int head = pq.peek();
        System.out.println("Head element using peek(): " + head);
        
        
        System.out.println("************* PriorityQueue : "+pq);
        // Removing elements from the PriorityQueue
        while (!pq.isEmpty()) {
            int element = pq.poll();  // Retrieves and removes the head of the queue
            System.out.println("Removed element: " + element);
        }
 
        
        
        
        
     // Peek at the element with the highest priority (smallest element)
        
     // Removing elements from the PriorityQueue    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
