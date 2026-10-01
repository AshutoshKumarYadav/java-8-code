package PracticeJava;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftShiftOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 2, 4, 1, 1, 2, 1, 3, 1};
		// First, create a stream with all 1's
		IntStream ones = Arrays.stream(a).filter(x->x==1);
		
		 // Then, create a stream with all non-1's (order preserved)
		IntStream others = Arrays.stream(a).filter(x->x!=1);
		
		// Concatenate the two streams
		//int[] result = IntStream.concat(ones, others).toArray();
		int[] result = IntStream.concat(ones, others).toArray();
		System.out.println(Arrays.toString(result));
	}

}
