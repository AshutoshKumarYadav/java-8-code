package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printing the even number
		List<Integer> number = Arrays.asList(2,3,6,5,9,7);
		List<Integer> evenNumber = number.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenNumber);
	}

}
