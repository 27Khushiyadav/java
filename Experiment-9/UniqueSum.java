/*5. Given an ArrayList of integers (possibly with duplicates), find the sum of its unique values. \[Hint: Convert it to HashSet]
   Example:
   Input: \[3, 5, 3, 8, 2, 5]
   Unique values: \[3, 5, 8, 2]
   Sum: 18
 */
import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSum {
    public static void main(String[] args) {
        // Input list with duplicates
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        // Convert to HashSet to get unique values
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Calculate sum of unique values
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        // Output
        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Sum of unique values: " + sum);
    }
}
