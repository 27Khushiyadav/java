/* 4. Write a Java program to demonstrate the use of the final keyword with a class. Create a final class Logger with a method logMessage(String message) 
that prints the message to the console. Attempt to create another class ExtendedLogger that extends the Logger class, 
and observe and explain the result. In the main() method (in a separate class), create an object of the Logger class and call the logMessage() 
method to print a sample message.
write a simple program with input taken from the user. */
import java.util.Scanner;  // Import Scanner for user input

// Final class Logger
final class Logger {
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// Attempt to create ExtendedLogger (this will cause an error)
// class ExtendedLogger extends Logger {
//     void logMessage(String message) {
//         System.out.println("Extended Log: " + message);
//     }
// }

// Main class to test Logger
public class LoggerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a message to log: ");
        String message = scanner.nextLine();

        // Creating Logger object and calling logMessage()
        Logger logger = new Logger();
        logger.logMessage(message);

        scanner.close(); // Close scanner
    }
}

    

