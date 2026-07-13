// Write a program of Java using IF condition

import java.util.Scanner;

public class StuGrade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Biology marks: ");
        int biology = sc.nextInt();


        int total = physics + chemistry + biology;
        double percentage = total / 3.0;

        
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        //  If conditions.....

        if (percentage>90)
	{
	    System.out.println("Grade: A"); 
        }
	 else if (percentage > 70) 
	{
            System.out.println("Grade: B");
        }
	 else if (percentage < 50) 
	{
            System.out.println("Grade: Fail");
        }
	 else 
	{
            System.out.println("Grade: C");
        }

        sc.close();
    }
}
