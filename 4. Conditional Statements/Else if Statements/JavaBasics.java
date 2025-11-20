import java.util.*;
public class JavaBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("Positive");
        }
        else if(a < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

    }
    
}
/*
 ---------------------------------------------------------
 *                 ELSE IF STATEMENT IN JAVA
 * ---------------------------------------------------------
 *
 * The else-if statement is used when you need to check
 * MULTIPLE conditions one after another.
 *
 * It works like a ladder:
 * - First, the IF condition is checked.
 * - If IF is false, then the ELSE IF conditions are checked
 *   one by one from top to bottom.
 * - The FIRST condition that becomes TRUE will run its block.
 * - If NONE of the conditions are true, the final ELSE runs.
 *
 */
