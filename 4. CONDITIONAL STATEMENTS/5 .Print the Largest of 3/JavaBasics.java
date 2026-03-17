import java.util.*;
public class JavaBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a >= b && a >= c){
            System.out.println("A is Largest");
        } else if(b >= c){
            System.out.println("B is Largest");
        } else{
            System.out.println("C is Largest");
        }
    }
    
}
