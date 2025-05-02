/*2.	Print this Pattern:
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1
 */
public class PatternPrinter {
    public static void main(String[] args) {
        // Loop for each row
        for (int i = 5; i >= 1; i--) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}


    

