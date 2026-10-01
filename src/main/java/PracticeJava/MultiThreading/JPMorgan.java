package PracticeJava.MultiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class JPMorgan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {2,4,3,6,8};
		int numA[] = {1, 2, 4, 5};
		String parenthesis = "({[]})";
		String strA = "listen";
		String strB = "silent";
		String strC = "Java is cool";
		System.out.println(compress("aaabbc"));
		System.out.println(secondHighest(num));
		System.out.println(isValid(parenthesis));
		System.out.println(anagram(strA,strB));
		System.out.print(frequancy("ashutosh\n"));
		System.out.println("\n"+findMissing(numA,5));
		System.out.println(reverseWords(strC));
		
		int stairs = 4;
		int maxJump = 3;
		List<String> result = new ArrayList<>();
		findWays(stairs,maxJump,"",result);
		result.sort(Comparator.reverseOrder());
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		

	}
	 //Input: "aaabbc"
	// 🎯 Output: "a3b2c1"
	public static String compress(String str) {
		StringBuilder result = new StringBuilder();
		int count=1;
		for(int i=1;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i) !=str.charAt(i-1)) {
				result.append(str.charAt(i-1)).append(count);
				count = 1;
			}else {
				count++;
			}
		}
		return result.toString();
	}
	// Array second Highest
	public static int secondHighest(int nums[]) {
		Integer max=null,second=null;
		for(int num:nums) {
			if(max==null || num>max) {
				second=max;
				max=num;
			}else if(num>second && num<max){
				second=num;
				
			}
		}
		return second !=null?second:-1;
	}
	
	
	//Input:"({[]})"
	//Output: true
	
	//Valid Parenthis checker
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(char ch:s.toCharArray()) {
			if(ch=='(') stack.push(')');
			else if(ch=='{') stack.push('}');
			else if(ch=='[') stack.push(']');
			else if(stack.isEmpty() || stack.pop() !=ch) return false;
			
		}
		return stack.isEmpty();
	}
	
	//Anagram Checker
	//Input: "listen", "silent"
	//Output: true
	
	
	public static boolean anagram(String s1, String s2) {
		char[] s = s1.toCharArray();
		char[] s0 = s2.toCharArray();
		Arrays.sort(s);
		Arrays.sort(s0);
		return Arrays.equals(s, s0);
	}
	
	//Count Frequency of Characters
	
	public static Map<Character,Long> frequancy(String input){
		return input.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	}
	
	//Find Missing Number in 1 to N
	//Input: [1, 2, 4, 5]
	//Output: 3
	
	public static int findMissing(int arr[],int n) {
		int expectedSum = n*(n+1)/2;
		int actualSum = Arrays.stream(arr).sum();
		return expectedSum - actualSum;
	}
	
	//Input: "Java is cool"
	//Output: "cool is Java"
	
	public static String reverseWords(String sentence) {
		String[] word = sentence.trim().split("\\s+");
		Collections.reverse(Arrays.asList(word));
		return String.join("", word);
	}
	
	
	//StaireCaseProblem
	public static void findWays(int stairs,int maxJump, String current,List<String> result) {
		if(stairs==0) {
			result.add(current);
			return;
		}
		for(int i=1;i<=maxJump;i++) {
			if(stairs-i>=0) {
				findWays(stairs-i,maxJump,current+i,result);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


















