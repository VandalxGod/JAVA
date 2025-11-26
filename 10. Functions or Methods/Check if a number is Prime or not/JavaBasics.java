import java.util.*;
public class JavaBasics {
    // public static boolean isPrime(int a){
    //     boolean isPrime = true;
    //     for(int i=2; i<=a/2; i++){
    //         if(a%i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    public static boolean isPrime(int a){
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPrime(a));

    }
}
