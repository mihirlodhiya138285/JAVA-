 //5. Write a java program to  get different values from user at runtime using Scanner. 

import java.util.Scanner;

public class Runtime_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        // Ask for different values
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.print("Enter a decimal value: ");
        double decimal = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Display the values entered
        System.out.println("\n Values Entered  : ");
        System.out.println("Integer: " + number);
        System.out.println("Decimal: " + decimal);
        System.out.println("String: " + text);

        sc.close();
    }
}
