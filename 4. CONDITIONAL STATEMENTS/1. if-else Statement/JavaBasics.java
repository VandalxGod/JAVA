import java.util.*;
public class JavaBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 18){
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
                                                 }
}

/*
 * -----------------------------------------------------
 *                IF – ELSE STATEMENTS IN JAVA
 * -----------------------------------------------------
 *
 * if-else is used to make decisions based on conditions.
 * A condition must evaluate to TRUE or FALSE.
 *
 * -------------------------
 * 1. SIMPLE IF STATEMENT
 * -------------------------
 * - Executes a block of code only when the condition is TRUE.
 * - If the condition is FALSE, nothing happens.
 *
 * Example:
 * if (condition) {
 *     // runs only when condition is true
 * }
 *
 *
 * -------------------------
 * 2. IF – ELSE STATEMENT
 * -------------------------
 * - If condition is TRUE → execute IF block
 * - If condition is FALSE → execute ELSE block
 *
 * Example:
 * if (condition) {
 *     // runs when true
 * } else {
 *     // runs when false
 * }
 *
 
 */
