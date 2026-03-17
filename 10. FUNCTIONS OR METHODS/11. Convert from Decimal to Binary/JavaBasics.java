import java.util.*;
public class JavaBasics {

    public static void DectoBin(int n){
        int k = 0;
        int pow = 0;
        while(n>0){
            int f = n%2;
            k = k + (f*(int)Math.pow(10, pow));
            n = n/2;
            pow++;
        }
        System.out.println(k);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DectoBin(n);
    }
    
}
