/*4) "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.
Example 1:
Input: Str =  “LEVEL”
Output: Palindrome

 */
import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Convert the string to uppercase to handle case-insensitive comparison
        str = str.toUpperCase();
        
        int start = 0;
        int end = str.length() - 1;

        // Compare characters from both ends of the string
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }

        return true; // If all characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Checking if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }
}

    

