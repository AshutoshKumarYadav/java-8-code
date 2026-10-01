package PracticeJava;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestWordList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find longest word in the list
		List<String> strList = Arrays.asList("cat","Elephant","tiger");
		String number = strList.stream().max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println(number);
	}

}
