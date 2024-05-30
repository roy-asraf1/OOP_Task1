package lambda.FirstLambda;

@FunctionalInterface
interface InterfaceCalcultion {
	public double calculate(double x, double y);
}

public class LambdaCalculate {

	public static void main(String[] args) {
		//  Anonymous 
		InterfaceCalcultion ip = new InterfaceCalcultion() {
			public double calculate(double x, double y) {
				return Math.sqrt(x*x + y*y);
			}
		};
		double a = ip.calculate(3, 4);
		System.out.println("Anonymous: a = " + a);
		
		// Lambda
		InterfaceCalcultion ip1 = (x, y) -> x+y;//Math.sqrt(x*x + y*y);
		double b = ip1.calculate(3,4);
		System.out.println("Lambda: b = " + b);
		 
		// calculate the perimeter of a rectangle
		InterfaceCalcultion ip2 = (x, y) -> 2*(x + y);
		double c = ip2.calculate(3,4);
		System.out.println("Lambda: c = " + c);
		 
		// calculate the area of a rectangle
		InterfaceCalcultion ip3 = (x, y) -> x * y;
		double d = ip3.calculate(3,4);
		System.out.println("Lambda: d = " + d);
	}
}
