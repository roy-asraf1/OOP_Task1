package lambda.FirstLambda;

@FunctionalInterface
interface Average{
	double avr(double[] arr);
}

public class LambdaAverage {
	public static double calcAvr(double[]arr) {
		Average av = (double[] a)->{
			double val = 0;
			for(double x : a) {
				val = val + x;
			}
			return val/a.length;
		};
		return av.avr(arr);
	}
	public static void main(String[] args) {
		double []arr = {1,2,3,4,5,6};
		System.out.println(calcAvr(arr));

	}

}
