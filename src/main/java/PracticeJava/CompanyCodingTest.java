package PracticeJava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CompanyCodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is Ashutosh kumar";
		String distinctChars = s.chars().mapToObj(c->String.valueOf((char)c).toLowerCase()).distinct().collect(Collectors.joining(", "));
		// Output the distinct characters
        System.out.println("Distinct characters: " + distinctChars);
	}

}
