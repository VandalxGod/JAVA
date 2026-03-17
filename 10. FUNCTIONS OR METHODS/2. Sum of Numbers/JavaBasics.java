import java.util.*;
public class JavaBasics {
    public static int TotalSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = TotalSum(n, m);
        System.out.println("Total sum of n and m : " + sum);
    }
}