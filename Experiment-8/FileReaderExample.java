/*
1) Write a Java program that reads a file name from the user and attempts to open and read the file. 
Define a method readFile() that throws a FileNotFoundException using the throws keyword. In the main method, 
call this method and handle the exception using a try-catch block. Display an appropriate message if the file is not found. 
Use a finally block to ensure a message like "File operation attempted" is printed.


I have written the code with comments for making it easy to understand.
 */




 import java.io.*;
 import java.util.Scanner;
 
 public class FileReaderExample {
     
     // Method that attempts to read a file and throws FileNotFoundException
     public static void readFile(String fileName) throws FileNotFoundException {
         File file = new File(fileName); // Create a File object with the given file name
         Scanner fileScanner = new Scanner(file); // Scanner to read the file
         
         System.out.println("File content:");
         while (fileScanner.hasNextLine()) { // Loop to read each line from the file
             System.out.println(fileScanner.nextLine()); // Print the line to the console
         }
         fileScanner.close(); // Close the scanner
     }
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); // Scanner to take user input
         System.out.print("Enter file name: ");
         String fileName = scanner.nextLine(); // Read file name from user
         
         try {
             readFile(fileName); // Call the method to read file
         } catch (FileNotFoundException e) {
             System.out.println("Error: File not found!"); // Handle the exception if file is not found
         } finally {
             System.out.println("File operation attempted."); // Ensures this message is printed regardless of success or failure
         }
         
         scanner.close(); // Close the scanner
     }
 }
 
     
 
 
 

