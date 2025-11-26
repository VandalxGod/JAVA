import java.util.*;
public class JavaBasics {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(sum(3,5));
        System.out.println(sum(6,7,8));

        
    }
    
}
// Function Overloading - using different number of parameters