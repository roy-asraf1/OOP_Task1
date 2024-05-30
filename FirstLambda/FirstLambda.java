package lambda.FirstLambda;
interface Arithmetic{
    int plus(int x, int y);
}

public class FirstLambda {
    public static void main(String[] args) {
        Arithmetic plus2 = (x, y) -> x + y;
        System.out.println(plus2.plus(3, 9));

        Arithmetic a = new Arithmetic(){
           @Override
            public int plus(int x, int y) {
                return x + y;
            }
        };
        System.out.println(a.plus(5, 12));
    }
}
