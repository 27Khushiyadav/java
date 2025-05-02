/*3. Write a Java program that reads the contents of a file named student.txt using FileReader and displays the data on the console.
 Handle FileNotFoundException if the file does not exist and display an appropriate error message. Use a try-catch block 
 for exception handling.
*/
import java.io.*;

public class StudentDataReader {
    public static void main(String[] args) {
        String fileName = "student.txt"; // File to read data from
        
        // Attempt to read the file
        try (FileReader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            System.out.println("Contents of " + fileName + ":");
            while ((line = bufferedReader.readLine()) != null) { // Read file line by line
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found! Please ensure 'student.txt' exists."); // Handle file not found error
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage()); // Handle other I/O errors
        }
    }
}
