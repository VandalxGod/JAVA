
public class JavaBasics {
    public static void main(String[] args){
        int a = 10;
        System.out.println("Initial value of a: " + a);

        // Using basic assignment operator
        int b = a;
        System.out.println("Value of b after basic assignment (b = a): " + b);

        // Using compound assignment operators
        a += 5; // a = a + 5
        System.out.println("After a += 5, value of a: " + a);

        a -= 3; // a = a - 3
        System.out.println("After a -= 3, value of a: " + a);

        a *= 2; // a = a * 2
        System.out.println("After a *= 2, value of a: " + a);

        a /= 4; // a = a / 4
        System.out.println("After a /= 4, value of a: " + a);

        a %= 3; // a = a % 3
        System.out.println("After a %= 3, value of a: " + a);     

    }
    
}

/*
    =====================================
          ASSIGNMENT OPERATORS IN JAVA
    =====================================

    Assignment operators are used to assign
    values to variables. Some operators also
    perform operations before assigning.

    1. Basic Assignment Operator
       ---------------------------
       =    Assigns value
       Example:
       int a = 10;

    2. Compound Assignment Operators
       -------------------------------
       +=   Add and assign        (a += 5 → a = a + 5)
       -=   Subtract and assign   (a -= 3 → a = a - 3)
       *=   Multiply and assign   (a *= 2 → a = a * 2)
       /=   Divide and assign     (a /= 4 → a = a / 4)
       %=   Modulus and assign    (a %= 2 → a = a % 2)

    Example:
    int a = 10;

    a += 5;   // a = 15
    a -= 2;   // a = 13
    a *= 3;   // a = 39
    a /= 3;   // a = 13
    a %= 4;   // a = 1

    Notes:
    - Compound assignment helps shorten expressions.
    - Works with all numeric data types.
*/
