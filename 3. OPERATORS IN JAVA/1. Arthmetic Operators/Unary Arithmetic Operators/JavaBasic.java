
public class JavaBasic {
    public static void main(String[] args){
        int a = 5;
        System.out.println("Original value of a: " + a);

        // Using unary plus operator
        int plusA = +a;
        System.out.println("Using unary plus operator: " + plusA);

        // Using unary minus operator
        int minusA = -a;
        System.out.println("Using unary minus operator: " + minusA);

        // Using increment operator
        a++;
        System.out.println("After incrementing, value of a: " + a);

        // Using decrement operator
        a--;
        System.out.println("After decrementing, value of a: " + a);
    }
}

//        Unary Arithmetic Operators
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
