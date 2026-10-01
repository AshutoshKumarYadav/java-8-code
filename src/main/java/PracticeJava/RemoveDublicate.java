package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// remove dublicate from list
		
		List<Integer> numberList = Arrays.asList(2,2,4,5,5,6,8,8);
		List<Integer> removedDublicate = numberList.stream().distinct().collect(Collectors.toList());
		System.out.println(removedDublicate);
	}

}
