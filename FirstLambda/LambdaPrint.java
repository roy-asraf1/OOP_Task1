package lambda.FirstLambda;

@FunctionalInterface
interface Printable{
    public void print(String s);
}
public class LambdaPrint {

	public static void main(String[] args) {
		Printable printer;
		printer = s -> System.out.println(s);
		printer.print("I love Lambda");
		///
		Printable printerA = new Printable(){
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		printerA.print("Using Anonimius");
	}

}
