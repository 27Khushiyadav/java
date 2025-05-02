/* QUESTION 3 :- Create a University class that has a static variable universityName and a non-static variable studentName. 
Include a static method to display the university name. Then, create multiple student objects to demonstrate how the static variable
 is shared among all instances, while the non-static variable holds unique values for each object. */
import java.util.Scanner;

class University {
    static String universityName;
    String studentName;

    // Static method to display university name
    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Constructor to initialize student name
    public University(String studentName) {
        this.studentName = studentName;
    }

    // Method to display student details
    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter University Name: ");
        universityName = scanner.nextLine();

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        University[] students = new University[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter Student " + (i + 1) + " Name: ");
            String studentName = scanner.nextLine();
            students[i] = new University(studentName);
        }

        displayUniversityName();
        for (University student : students) {
            student.displayStudent();
        }

        scanner.close();
    }
}

