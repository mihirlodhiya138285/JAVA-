// Write a java program of 1D array 

import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] numbers = new int[5];

        // Input values into the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display the values
        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }

        sc.close();
    }
}
