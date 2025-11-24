import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Upper part
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else if(j>i && j<=m-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Lower part (corrected loop)
        for(int i=n; i>=1; i--){
            for(int j=1; j<=m; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else if(j>i && j<=m-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
