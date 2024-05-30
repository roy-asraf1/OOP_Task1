package lambda.FirstLambda;
import java.util.Arrays;
import java.util.List;

public class LambdaList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		numbers.forEach(n -> System.out.print(n+", "));
		System.out.println();
		
		numbers.forEach(value -> System.out.print(value+", "));
		System.out.println();
		
		numbers.forEach(System.out::print);	
		System.out.println();
		//
	}
}
