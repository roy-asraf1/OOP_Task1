package lambda.FirstLambda;

@FunctionalInterface
interface Operation{
    int calculate();
}

public class LambdaStatic {
    static int x = 10;
    static int y = 20;
    public int sum() {
		Operation op = () -> {
	    	int s = 0;
			s = x+y;
	    	return s;
		};
		return op.calculate();
    }
	public static void main(String[] args) {
		Operation op = () -> {
			//x = 100;
			return x+y;
		};
		int z = op.calculate();
		System.out.println("z = "+z);
		//////
		LambdaStatic obj = new LambdaStatic();
		System.out.println("sum = "+obj.sum());		
	}

}
