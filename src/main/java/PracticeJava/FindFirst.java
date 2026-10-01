package PracticeJava;
import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find first element form list that satisfy condition
		List<Integer> listNumber = Arrays.asList(1,2,3,4,5,6);
		int number = listNumber.stream().filter(x->x%2==0).findFirst().orElse(-1);
		System.out.println(number);
	}

}
