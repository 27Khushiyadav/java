/*QUESTION 4 :- A student is developing a course registration system that allows students to enroll in courses. Each course has a course 
name and course code. Implement a Course class with appropriate attributes and use the “this” keyword to differentiate between class 
attributes and constructor parameters during initialization. Create an object of the Course class and display the course details. */
import java.util.Scanner;

class Course {
    String courseName;
    String courseCode;

    // Constructor using "this" keyword to differentiate parameters
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        Course course = new Course(courseName, courseCode);

        System.out.println("\nCourse Details:");
        course.displayCourseDetails();

        scanner.close();
    }
}
