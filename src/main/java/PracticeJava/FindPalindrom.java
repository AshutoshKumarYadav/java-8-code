package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find all palindrom in list
		List<String> palindrom = Arrays.asList("level","java");
		List<String> isPalindrom = palindrom.stream().filter(x->x.equals(new StringBuilder(x).reverse().toString())).collect(Collectors.toList());
		System.out.println(isPalindrom);
	}

}
