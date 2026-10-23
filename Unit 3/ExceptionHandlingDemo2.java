import java.util.Scanner;

class ExceptionHandlingDemo2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value For A :");
		int a = sc.nextInt();

		System.out.print("Enter Value For B :");
		int b = sc.nextInt();

		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
	
		System.out.println("Addition :" + sum);	
		System.out.println("Substraction :" + sub);
		System.out.println("Multiplication :" + mul);
		
	try
	{	
		int div;
		div = a / b ; 
		System.out.println("Division :" +div);
		
	}

	catch(Exception e)
		{
			System.out.println("You can not Divide any number by Zero .");	
		}
		
		System.out.println("I want to be executed....");
	}
}
