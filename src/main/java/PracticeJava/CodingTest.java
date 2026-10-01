package PracticeJava;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Welcome to Java world Welcome to india
		
		String str = "Welcome to Java world Welcome to india";
		Map<Object, Long> mapResult = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(" *** "+mapResult);
	}

}
