import java.util.*;
public class JavaBasics {

    public static int AddTwoNumber(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = AddTwoNumber(a,b);
        System.out.println(sum);
    }
}
