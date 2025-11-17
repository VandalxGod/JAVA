import java.util.*;
public class JavaBasics {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
    
}


// ================================================
//           ARITHMETIC OPERATORS (UNARY & BINARY)
//     ================================================

//     1. Unary Arithmetic Operators
//        -----------------------------
//        These operators work on a single operand.

//         +   Unary plus  (indicates positive value)
//         -   Unary minus (negates the value)
//        ++  Increment
//             a++  -> post-increment
//             ++a  -> pre-increment
//        --  Decrement
//             a--  -> post-decrement
//             --a  -> pre-decrement

       
//     2. Binary Arithmetic Operators
//        ------------------------------
//        These operators work on two operands.

//        +   Addition (a + b)
//        -   Subtraction (a - b)
//        *   Multiplication (a * b)
//        /   Division (a / b)
//        %   Modulus (remainder) (a % b)