import java.util.*;
public class JavaBasics {
    public static void main(String[] args){

    //    Input Methods:
    //    ----------------
    //    sc.nextInt();      // reads an integer
    //    sc.nextFloat();    // reads a float
    //    sc.nextDouble();   // reads a double
    //    sc.nextLong();     // reads a long
    //    sc.nextBoolean();  // reads true/false
    //    sc.next();         // reads a single word
    //    sc.nextLine();     // reads a full line including spaces
    //    sc.nextByte();     // reads a byte
    //    sc.nextShort();    // reads a short

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String name = sc.next();

        System.out.println("Integer a: " + a);
        System.out.println("Integer b: " + b);      
        System.out.println("String name: " + name);
    }
    
}
