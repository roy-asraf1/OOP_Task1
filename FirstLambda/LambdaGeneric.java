package lambda.FirstLambda;
interface CalculateGeneric<T>{
    T calculate(T x, T y);
}
public class LambdaGeneric {
    public static void main(String[] args) {
        CalculateGeneric<Integer> plusInt = (x, y) -> x + y;
        CalculateGeneric<String> plusString = (x, y) -> x + y;
        CalculateGeneric<Double> plusDouble = (x, y) -> x + y;
////
        System.out.println(plusInt.calculate(3, -9));
        System.out.println(plusString.calculate("Hello ", "World"));
        System.out.printf("%.2g",plusDouble.calculate(3.14, 2.5));
    }
}