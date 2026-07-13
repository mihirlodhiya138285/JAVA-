// 7. Write a java program to use IF Condition.

import java.util.Scanner;

public class VotingEligibility_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("Sorry, you are not eligible to vote.");
        }

        sc.close();
    }
}
