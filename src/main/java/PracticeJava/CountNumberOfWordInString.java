package PracticeJava;
import java.util.Arrays;

public class CountNumberOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Count Number of word in string
		String str = "Java is very good language";
		long intValue = Arrays.stream(str.split(" ")).count();
		System.out.println(intValue);
	}

}
