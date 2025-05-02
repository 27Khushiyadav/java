/*1.	Write a program to calculate the final grade of a student based on the marks entered in three subjects. Use the following grading scale:
Average >= 90: Grade A
Average >= 75: Grade B
Average >= 50: Grade C
Otherwise: Grade F

 */
import java.util.Scanner;

 public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        // Calculate the average
        double average = (subject1 + subject2 + subject3) / 3;

        // Determine the grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output the grade
        System.out.println("Your final grade is: " + grade);

        scanner.close();
    }
}
