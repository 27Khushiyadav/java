/* 
2)  Write a Java program that takes user input for a student's name, roll number, and grade, and writes this information to
 a file named student.txt using FileWriter. Ensure the program appends the data to the file if it already exists.
  Handle any exceptions using try-catch and display an appropriate message if an error occurs.
Sample File Content: 
Name: Aman, Roll Number: 120112, Grade: A
Name: Parul, Roll Number: 120131, Grade: B

 */
    

 import java.io.*;
 import java.util.Scanner;
 
 public class StudentDataWriter {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); // Scanner to take user input
         
         // Taking user input
         System.out.print("Enter Student Name: ");
         String name = scanner.nextLine();
         
         System.out.print("Enter Roll Number: ");
         int rollNumber = scanner.nextInt();
         
         System.out.print("Enter Grade: ");
         String grade = scanner.next();
         
         // Writing data to file
         try (FileWriter writer = new FileWriter("student.txt", true)) { // Open file in append mode
             writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
             System.out.println("Student data written successfully.");
         } catch (IOException e) {
             System.out.println("Error writing to file: " + e.getMessage()); // Handle exception
         }
         
         scanner.close(); // Close scanner to prevent memory leaks
     }
 }
 