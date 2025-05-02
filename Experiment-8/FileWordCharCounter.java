/*4) Write a program that prompts the user for a text file name, opens the file using a FileInputStream (or FileReader),
 and counts the total number of words and characters (excluding whitespace). Print these counts to the console. 
 Test your program on files with varied content and edge cases (e.g., empty file, file with only whitespace, etc.). */
 import java.io.*;
 import java.util.Scanner;
 
 public class FileWordCharCounter {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); // Scanner for user input
         
         // Prompting user for the file name
         System.out.print("Enter the file name: ");
         String fileName = scanner.nextLine();
         
         int wordCount = 0;
         int charCount = 0;
         
         // Attempt to read the file and count words and characters
         try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
             String line;
             while ((line = bufferedReader.readLine()) != null) { // Read file line by line
                 String[] words = line.trim().split("\\s+"); // Split by whitespace to count words
                 if (!line.trim().isEmpty()) {
                     wordCount += words.length;
                 }
                 
                 charCount += line.replaceAll("\\s", "").length(); // Count characters excluding whitespace
             }
             
             // Print results
             System.out.println("Total Words: " + wordCount);
             System.out.println("Total Characters (excluding whitespace): " + charCount);
             
         } catch (FileNotFoundException e) {
             System.out.println("Error: File not found! Please check the file name and try again."); // Handle file not found error
         } catch (IOException e) {
             System.out.println("Error reading file: " + e.getMessage()); // Handle other I/O errors
         }
         
         scanner.close(); // Close scanner to prevent resource leak
     }
 }
 