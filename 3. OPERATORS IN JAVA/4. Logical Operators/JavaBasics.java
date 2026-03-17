public class JavaBasics {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        // Logical AND
        System.out.println((a < b) && (a > 5)); // true

        // Logical OR
        System.out.println((a < b) || (a < 5)); // true

        // Logical NOT
        System.out.println(!(a < b)); // false  
    }
    
}

 /*
         * ---------------------------------------------------------
         *              LOGICAL OPERATORS IN JAVA
         * ---------------------------------------------------------
         * Logical operators work with boolean values.
         * They return true or false.
         *
         * Operators:
         * 1. AND  (&&)
         * 2. OR   (||)
         * 3. NOT  (!)
         *
         * Below we test EVERY possible combination.
         * 
         * 
         *  ---------------------------------------------------------
         *                    AND OPERATOR  (&&)
         * ---------------------------------------------------------
         * true && true   = true
         * true && false  = false
         * false && true  = false
         * false && false = false
         * ---------------------------------------------------------
         *                    OR OPERATOR  (||)
         * ---------------------------------------------------------
         * true || true   = true
         * true || false  = true
         * false || true  = true
         * false || false = false
         * 
         *  ---------------------------------------------------------
         *                    NOT OPERATOR  (!)
         * ---------------------------------------------------------
         * !true  = false
         * !false = true
         * 
         * 
         * ---------------------------------------------------------
         *              SHORT-CIRCUITING BEHAVIOR
         * ---------------------------------------------------------
         * AND (&&):
         *   - If the first condition is false,
         *     Java does NOT check the second condition.
         *
         * OR (||):
         *   - If the first condition is true,
         *     Java does NOT check the second condition.
*/