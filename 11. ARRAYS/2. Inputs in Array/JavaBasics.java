import java.util.*;
public class JavaBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [3];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Phy : " + arr[0]);
        System.out.println("Che : " + arr[1]);
        System.out.println("Math : " + arr[2]); 

    }
}
 