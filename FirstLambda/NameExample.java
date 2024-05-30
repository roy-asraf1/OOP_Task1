package lambda.FirstLambda;

interface Names {
    public void sayName(String name);
}
public class NameExample {
    public static void main(String[] args) {
        myName(n -> System.out.println("My name is " + n));
    }
    private static void myName(Names nameInstance) {
        nameInstance.sayName("John");
    }
}