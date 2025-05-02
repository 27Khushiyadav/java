/*4. Write a Java program to create an interface Playable with methods play(), pause(), and stop(). Implement this interface in a class
 MusicPlayer that overrides these methods to print appropriate messages (e.g., "Music is playing," "Music is paused," "Music is stopped").
Create another class TestPlayer with a main() method to test the functionality by calling 
the play(), pause(), and stop() methods. */
import java.util.Scanner;  // Import Scanner for user input

// Playable interface with play, pause, and stop methods
interface Playable {
    void play();
    void pause();
    void stop();
}

// MusicPlayer class implementing Playable interface
class MusicPlayer implements Playable {
    public void play() {
        System.out.println("Music is playing...");
    }

    public void pause() {
        System.out.println("Music is paused.");
    }

    public void stop() {
        System.out.println("Music is stopped.");
    }
}

// TestPlayer class with main() method to test functionality
public class TestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicPlayer player = new MusicPlayer();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Play Music");
            System.out.println("2. Pause Music");
            System.out.println("3. Stop Music");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

