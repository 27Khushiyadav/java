/*  1) Write a Java program to find the second largest element in an integer array without sorting the array, if not exist return -1.
Example:
Input: arr = {12,32,22,54,39,53,19}
Output: 53 */
import java.util.Scanner;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements for a second largest
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        boolean found = false; // To check if a valid second largest exists

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
                found = true;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
                found = true;
            }
        }
        
        return found ? secondLargest : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("Second largest does not exist.");
            return;
        }
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest Element: " + secondLargest);
        
        scanner.close();
    }
}

    

