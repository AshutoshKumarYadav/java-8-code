package PracticeJava;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list of random number
		List<Double> randomNumber = new Random().doubles(5,0,10).boxed().collect(Collectors.toList());
		System.out.println(randomNumber);
	}

}
