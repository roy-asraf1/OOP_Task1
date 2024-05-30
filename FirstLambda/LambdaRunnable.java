package lambda.FirstLambda;
public class LambdaRunnable {

	public static void main(String[] args) {
		System.out.println("=== RunnableTest ===");
		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable: Hello World!");
			}
		}; 
		new Thread(r1).start();
		
		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Lambda: Hello World!");
		new Thread(r2).start();
		////////
 	}
}
