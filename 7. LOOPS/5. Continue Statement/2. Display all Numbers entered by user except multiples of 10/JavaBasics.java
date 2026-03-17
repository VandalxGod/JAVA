import java.util.*;
public class JavaBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            else{
                System.out.println(n);
            }
        }while(true);
    }
    
}
