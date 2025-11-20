import java.util.*;
public class JavaBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int itemCose = sc.nextInt();
        switch(itemCose){
            case 1:
                System.out.println("Burger ordered");
                break;
            case 2:
                System.out.println("Pizza ordered");
                break;
            case 3:
                System.out.println("Mango shake ordered");
                break;
            default:
                System.out.println("Invalid item code");
                break;
        }

    }
    
}
