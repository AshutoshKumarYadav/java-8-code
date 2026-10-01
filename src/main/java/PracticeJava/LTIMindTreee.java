package PracticeJava;

import java.util.List;
import java.util.stream.Collectors;

public class LTIMindTreee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ABC";
		permutation(str, "");
	//	i need permutations given string ..
		//str.chars().map(c->(char)c).collect(Collectors.groupingBy(x->(char)x,Collectors.counting());
		
		String str1 ="aaAABbCcDdFF";
		List<Character> collect = str1.chars().mapToObj(x->(char)x).filter(Character::isUpperCase).collect(Collectors.toList());
		System.out.println(collect);

	}
	
	public static void permutation(String str, String result) {
	    if (str.length() == 0) {
	        System.out.println(result);
	        return;
	    }

	    for (int i = 0; i < str.length(); i++) {
	        char current = str.charAt(i);
	        String remaining = str.substring(0, i) + str.substring(i + 1);
	        permutation(remaining, result + current);
	    }
	}


}
