package PracticeJava;
import java.util.stream.Stream;

public class InfiniteNumberStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generate infinte stream
		Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println);
	}

}
