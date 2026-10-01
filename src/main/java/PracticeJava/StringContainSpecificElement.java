package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringContainSpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check string contain specific element
		List<String> liststr = Arrays.asList("Alice","Apple","Mango");
		boolean match = liststr.stream().anyMatch(x->x.equals("Apple"));
		System.out.println(match);
	}

}
