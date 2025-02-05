import java.util.Scanner;

public class AreaCalculator {

    // Method to calculate the area of a rectangle (length * width)
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square (side * side)
    public double area(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle (π * radius^2)
    public double area(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle (0.5 * base * height)
    public double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        // Create an object of AreaCalculator to access the overloaded methods
        AreaCalculator calculator = new AreaCalculator();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        double area = 0;

        switch (choice) {
            case 1: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = calculator.area(length, width); // Calls the method for rectangle
                break;

            case 2: // Square
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                area = calculator.area(side); // Calls the method for square
                break;

            case 3: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = calculator.area(radius, true); // Calls the method for circle
                break;

            case 4: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = calculator.area(base, height, true); // Calls the method for triangle
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        // Output the calculated area
        System.out.println("The area is: " + area);

        // Close the scanner object
        scanner.close();
    }
}

    

