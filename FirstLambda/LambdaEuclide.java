package lambda.FirstLambda;
interface Euclid{
	public int gcdCalc(int a, int b);
}
public class LambdaEuclide{
	
	public static int gcdCalc(int a, int b){
		Euclid ans =  (int p, int q) ->{
				   if (q==0) return p;
				   return gcdCalc(q,p%q);
		};
		return ans.gcdCalc(a, b);
	}

	public static void main(String[] args) {
		System.out.println(gcdCalc(36,13));
		Runnable r = ()->{System.out.println("yes");};
		new Thread(r).start();
	}

}
