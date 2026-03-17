import java.util.*;
public class JavaBasics {
    public static int Factorial(int a){
        int n = 1;
        int fact = 1;
        while(n<=a){
            fact = fact * n;
            n++;
        }
        return fact;
    }
    public static int BinomialCoefficient(int a, int b){
        int factA = Factorial(a);
        int factB = Factorial(b);
        
        int factC = Factorial(a-b);

        int binCoeff = factA / (factB*factC);
        return binCoeff;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = BinomialCoefficient(a, b);
        System.out.println("Binomial Coefficient : " + total);


    }
}
