
public class JavaBasics {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        // Equal to
        System.out.println(a == b); // false

        // Not equal to
        System.out.println(a != b); // true

        // Greater than
        System.out.println(a > b);  // false

        // Less than
        System.out.println(a < b);  // true

        // Greater than or equal to
        System.out.println(a >= b); // false

        // Less than or equal to
        System.out.println(a <= b); // true
    }
    
}
/*
    =====================================
           RELATIONAL OPERATORS IN JAVA
    =====================================

    Relational operators are used to compare
    two values. The result is always boolean
    (true or false).

    Operators:
    --------------------------------
    ==   Equal to
    !=   Not equal to
    >    Greater than
    <    Less than
    >=   Greater than or equal to
    <=   Less than or equal to

    Example:
    int a = 10, b = 20;

    a == b;   // false
    a != b;   // true
    a < b;    // true
    a > b;    // false
    a <= b;   // true
    a >= b;   // false

    Notes:
    - Used in conditions (if, while, loops).
    - Always returns true or false.
*/