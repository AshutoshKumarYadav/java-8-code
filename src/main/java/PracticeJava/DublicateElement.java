package PracticeJava;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DublicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the duplicate element form list
		List<Integer>  number = Arrays.asList(2,1,8,5,4,3,3,4,8,5,1);
		Set<Integer> uniqNumber = new HashSet<>();
		List<Integer> dublicateNumber = number.stream().filter(x->!uniqNumber.add(x)).collect(Collectors.toList());
		System.out.println(dublicateNumber);
	}

}
