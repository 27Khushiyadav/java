/*4. Given an array of names with duplicates (e.g., \["Aman", "Varchasv", "Sourabh", "Varchasv", ”Aman”]), 
store them in a HashSet to eliminate duplicates. Check if a specific name exists in the set and print the unique names.
 */
import java.util.HashSet;

public class UniqueNamesSet {
    public static void main(String[] args) {
        // Array with duplicate names
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        // Store names in a HashSet to remove duplicates
        HashSet<String> uniqueNames = new HashSet<>();

        for (String name : names) {
            uniqueNames.add(name);  // HashSet automatically ignores duplicates
        }

        // Check if a specific name exists
        String searchName = "Varchasv";
        if (uniqueNames.contains(searchName)) {
            System.out.println(searchName + " exists in the set.");
        } else {
            System.out.println(searchName + " does not exist in the set.");
        }

        // Print all unique names
        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
