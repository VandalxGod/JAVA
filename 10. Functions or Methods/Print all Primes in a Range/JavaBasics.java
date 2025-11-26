import java.util.*;

public class JavaBasics {

    // Correct prime checker
    public static boolean isPrime(int a) {
        if (a <= 1) return false;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Print all primes up to n
    public static void PrimeRange(int n) {
        int k = 1;
        while (k <= n) {
            if (isPrime(k)) {
                System.out.println(k);
            }
            k++; // must increase for every iteration
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeRange(n);       // No need to print, function itself prints
    }
}
