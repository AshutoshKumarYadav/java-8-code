package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// All Element in list are Even
		List<Integer> number = Arrays.asList(3,5,7,8,6);
		List<Integer> evenNumber = number.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenNumber);
	}

}
