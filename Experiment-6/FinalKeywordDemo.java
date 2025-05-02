/* 3. Write a Java program to demonstrate the use of the final keyword with a variable and a method. Create a class MathConstants with 
a final variable PI (value = 3.14159) and a final method displayPI() that prints the value of PI. Create another class Circle that 
extends MathConstants and includes a method calculateArea(double radius) to calculate and print 
the area of a circle using the formula: area = PI * radius * radius. In the main() method (in a separate class or Circle), 
test the calculateArea() method and observe the behavior when attempting to modify the PI variable or override the displayPI() method.

 */
import java.util.Scanner;  // Import Scanner for user input

// Parent class with final variable and final method
class MathConstants {
    final double PI = 3.14159;  // Final variable (constant)

    final void displayPI() {  // Final method (cannot be overridden)
        System.out.println("Value of PI: " + PI);
    }
}

// Child class extending MathConstants
class Circle extends MathConstants {
    // Method to calculate area of a circle
    void calculateArea(double radius) {
        double area = PI * radius * radius; // Using the final variable PI
        System.out.println("Area of the circle: " + area);
    }

    // Attempt to override displayPI() will cause a compilation error
    // void displayPI() {
    //     System.out.println("Trying to override final method!");
    // }
}

// Main class to test functionality
public class FinalKeywordDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Creating Circle object
        Circle circle = new Circle();

        // Displaying PI and calculating area
        circle.displayPI();
        circle.calculateArea(radius);

        // Attempt to modify PI (Uncommenting the next line will cause an error)
        // circle.PI = 3.14;  // Compilation error: cannot assign a value to final variable 'PI'

        scanner.close(); // Close scanner
    }
}

