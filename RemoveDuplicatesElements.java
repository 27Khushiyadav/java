import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicatesElements {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // Sort the array

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i]; // Store unique elements
            }
        }
        temp[j++] = arr[n - 1]; // Add last unique element

        return Arrays.copyOf(temp, j); // Return array with only unique elements
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] uniqueArr = removeDuplicates(arr);

        System.out.print("Output: arr[] = { ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
        System.out.println("}");

        scanner.close();
    }
}
