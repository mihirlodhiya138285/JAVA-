//2. Write a java  program to get a name from user and display on screen.
import java.util.Scanner;

public class DisplayName(2) {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Display the name on the screen
        System.out.println("Hello, " + name + "!");

        
        scanner.close();
    }
}
