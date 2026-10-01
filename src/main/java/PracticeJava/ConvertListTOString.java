package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListTOString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Convert list of integer to String
		List<Integer> number = Arrays.asList(1,5,6);
		String numberConvertedToString = number.stream().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(numberConvertedToString);
	}

}
