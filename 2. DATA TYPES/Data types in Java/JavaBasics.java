
/*
    ================================
           DATA TYPES IN JAVA
    ================================

    1. Primitive Data Types (8 types)
       --------------------------------
       byte    - 1 byte, range: -128 to 127
       short   - 2 bytes, range: -32,768 to 32,767
       int     - 4 bytes, default integer type
       long    - 8 bytes, add 'L' at end (e.g., 123L)
       float   - 4 bytes, decimal numbers, use 'f' (3.14f)
       double  - 8 bytes, more precise decimals
       char    - 2 bytes, single character (e.g., 'A')
       boolean - true/false values

    2. Non-Primitive (Reference) Data Types
       ---------------------------------------
       String   - sequence of characters (e.g., "Sumit")
       Array    - collection of same-type values
       Class    - user-defined data type
       Interface- abstract methods blueprint
       Enum     - fixed set of constants

    Note:
    - Primitive types store actual values.
    - Non-primitive types store references to memory.
*/


public class JavaBasics {
    public static void main(String[] args){
        // Primitive Data Types
        int myInt = 100;
        double myDouble = 99.99;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        // Non-Primitive Data Type
        String myString = "Hello, Java!";
        System.out.println("String: " + myString);
    }
}
