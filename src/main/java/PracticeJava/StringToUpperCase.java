package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert list of string to uppercase
		List<String> string = Arrays.asList("ram","krishna","hello");
		List<String> stringConvertedToUppercase = string.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stringConvertedToUppercase);
	}

}
