
public class JavaBasics {
    // byte -> short -> int -> long -> float -> double
    public static void main(String[] args) {
        byte a = 10;
        int b = a;

        float f = 10.6f;
        int i = (int)f; // explicit conversion

        long l = 100;
        int k = (int)l; // explicit conversion


        System.out.println("Byte a: " + a);
        System.out.println("Int b (from byte a): " + b);

        System.out.println("Float f: " + f);
        System.out.println("Int i (from float f): " + i);

        System.out.println("Long l: " + l);
        System.out.println("Int k (from long l): " + k);
    }
}
