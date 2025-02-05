import java.util.Scanner;

public class RotateArray {
    public static void rotateRight(int[] arr, int K) {
        int n = arr.length;
        K = K % n; // In case K is larger than the length of the array

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first K elements
        reverse(arr, 0, K - 1);

        // Reverse the remaining n-K elements
        reverse(arr, K, n - 1);
    }

    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for array size and elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Take input for K (number of positions to rotate)
        System.out.print("Enter the number of positions to rotate (K): ");
        int K = scanner.nextInt();

        // Rotate the array right by K positions
        rotateRight(arr, K);

        // Print the rotated array
        System.out.print("Output: arr[] = { ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("}");

        scanner.close();
    }
}

    

