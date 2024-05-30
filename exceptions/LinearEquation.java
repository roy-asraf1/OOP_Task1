package exceptions;

import java.util.Scanner;

public class LinearEquation {
    // a*x + b = 0,  x = -b/a
    public static double linearEquation() throws RuntimeException{
        Scanner sc = new Scanner(System.in);
        //double x = 0;
        System.out.print("get a: ");
        double a = sc.nextDouble();
        System.out.print("get b: ");
        double b = sc.nextDouble();
        if (a != 0) {
            return -b / a;
        }
        else if (b!=0){
            throw new RuntimeException("There are no solutions");
        }
        else{
            throw new RuntimeException("Infinite solutions");
        }
    }

    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            try{
                double ans  = linearEquation();
                System.out.println("ans = " + ans);
                flag = false;
            }
            catch(RuntimeException ex){
                ex.printStackTrace();
            }
        }
    }
}
