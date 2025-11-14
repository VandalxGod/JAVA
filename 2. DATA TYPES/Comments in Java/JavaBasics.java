
public class JavaBasics {
    public static void main(String[] args){
        /*
    =====================================
                COMMENTS IN JAVA
    =====================================

    Comments are used to explain code, improve readability,
    and help developers understand the program.

    There are 3 types of comments in Java:

    1. Single-line Comment
       ---------------------
       // This is a single-line comment
       Used for short notes or explanations.

    2. Multi-line Comment
       ---------------------
       /*
          This is a multi-line comment
          It can span multiple lines
       *\/

       Used for long explanations or documentation inside code.

    3. Documentation Comment (JavaDoc)
       --------------------------------
       /**
        * This is a documentation comment
        * Used to generate HTML documentation
        * It describes classes, methods, variables, etc.
        *\/

       Typically used above methods and classes.

    Notes:
    - Comments are ignored by the Java compiler.
    - Use comments wisely to explain logic, not obvious code.
*/



        // Single-line comment example
        System.out.println("Hello, World!"); // Print greeting message

        /*
           Multi-line comment example
           The following code prints numbers from 1 to 5
        */
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        /**
         * Documentation comment example
         * This method adds two numbers and returns the sum
         */
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);

        
    }

    public static int addNumbers(int a, int b){
        return a + b;
    }
    
}
