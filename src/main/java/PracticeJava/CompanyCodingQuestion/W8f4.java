package PracticeJava.CompanyCodingQuestion;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class W8f4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "w4a3d1e1x6";
		String expanded = IntStream.range(0, str.length()/2)
				.mapToObj(i->{
					char ch = str.charAt(i*2);
					int count = Character.getNumericValue(str.charAt(i*2+1));
					// Repeat the character 'count' times using Collections.nCopies() and join them
					return String.join("", Collections.nCopies(count, String.valueOf(ch)));
				}).collect(Collectors.joining());
		System.out.println("********* expanded "+expanded);
	}

}
