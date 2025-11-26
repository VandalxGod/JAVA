import java.util.*;
public class JavaBasics {
    public static void ConverDectoBin(int n){
        int bin = n;
        int decimalNum = 0;
        int pow = 0;
        while(n>0){
            int ld= n%10;
            decimalNum = decimalNum +(ld * (int)Math.pow(2, pow));
            n = n/10;
            pow++;

        }
        System.out.println("Dec of " + bin + " = " +decimalNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ConverDectoBin(n);

    }
    
}
