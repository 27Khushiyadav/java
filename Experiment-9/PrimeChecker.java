/* 1. Store a list of integers in an ArrayList<Integer> using autoboxing. 
Iterate through the list, unbox each value, and determine if it is a prime number, printing the results.
*/
import java.util.ArrayList;

public class PrimeChecker {

    public static void main(String[] args) {
        // Autoboxing: primitive int values automatically converted to Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i); // autoboxing
        }

        // Iterate and check for prime
        for (Integer num : numbers) {
            int value = num; // unboxing (automatic)
            if (isPrime(value)) {
                System.out.println(value + " is a prime number.");
            } else {
                System.out.println(value + " is not a prime number.");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
