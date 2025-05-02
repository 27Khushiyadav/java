/*1.  Write a Java program to create an abstract class Shape with an abstract method calculateArea(). 
Derive two classes Rectangle and Circle from Shape and override the calculateArea() method to calculate 
and print the area of a rectangle and a circle, respectively. Use the main() method to create objects of
 Rectangle and Circle and test their calculateArea() methods.*/
 // Abstract class Shape with an abstract method calculateArea()
 import java.util.Scanner;  // Import Scanner for user input

 // Abstract class Shape with an abstract method calculateArea()
 abstract class Shape {
     abstract void calculateArea();
 }
 
 // Rectangle class extending Shape and overriding calculateArea()
 class Rectangle extends Shape {
     int length, width;
 
     Rectangle(int length, int width) {
         this.length = length;
         this.width = width;
     }
 
     void calculateArea() {
         System.out.println("Rectangle Area: " + (length * width));
     }
 }
 
 // Circle class extending Shape and overriding calculateArea()
 class Circle extends Shape {
     double radius;
 
     Circle(double radius) {
         this.radius = radius;
     }
 
     void calculateArea() {
         System.out.println("Circle Area: " + (Math.PI * radius * radius));
     }
 }
 
 // Main class to take user input and test the program
 public class CalculateArea{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);  // Create Scanner object
 
         // Taking input for Rectangle
         System.out.print("Enter length of rectangle: ");
         int length = scanner.nextInt();
         System.out.print("Enter width of rectangle: ");
         int width = scanner.nextInt();
 
         // Taking input for Circle
         System.out.print("Enter radius of circle: ");
         double radius = scanner.nextDouble();
 
         // Creating objects and calculating areas
         Rectangle rect = new Rectangle(length, width);
         Circle circle = new Circle(radius);
 
         rect.calculateArea();
         circle.calculateArea();
 
         scanner.close(); // Close scanner
     }
 }
 