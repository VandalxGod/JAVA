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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int F = Factorial(a);
        System.out.println("Factoral of" + a + " : " + F);
    }
    
}
