package lambda.FirstLambda;

@FunctionalInterface
interface BlockCalcultion{
	boolean calculation(int num);
}
public class LambdaBlock {

	public static void main(String[] args) {
		BlockCalcultion isPrime = (int num) -> {
			boolean ans = true;
			double sqn = Math.sqrt(num);
			for(int i=2; ans && i<=sqn; i++){//<=
				if (num%i == 0) ans = false;
			}
			return ans;
		};
		System.out.println("13 is prime? " + isPrime.calculation(13));//true
		System.out.println("25 is prime? " + isPrime.calculation(25));//false
		System.out.println("33333331 is prime? " + isPrime.calculation(33333331));//true
		System.out.println("1001 is prime? " + isPrime.calculation(1001));//false
	}
}
