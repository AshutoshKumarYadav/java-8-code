package PracticeJava;

import java.util.stream.IntStream;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "Race car";   // This should be a palindrome
        String test2 = "Java 8";     // This is not a palindrome
        System.out.println(isPal(test1));
        System.out.println(isPal(test2));
		
	}
	public  static boolean isPal(String str) {
		// Remove whitespace and convert to lower case for a case-insensitive check
		String cleaned = str.replaceAll("\\s+", "").toLowerCase();
		 // Check if the string equals its reverse using IntStream
		return IntStream.range(0, cleaned.length()).allMatch(x->cleaned.charAt(x)==cleaned.charAt(cleaned.length()-x-1));
		
	}

}
