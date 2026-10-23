class ExceptionHandlingDemo
{ 
	public static void main(String args[])
	{
		int a , b;
		a = 10;
		b = 5;
		int sum = a + b; //declaration + Initialization (by refrence)
		int sub = a - b;
		int mul = a * b;

		System.out.println("Addition :" + sum);
		System.out.println("Substraction :" + sub);
		System.out.println("Multiplication :" + mul);

		try
		{
			int div;
			div = a / b ; // here exception will occur 
			System.out.println("Division :" +div);
		
		}

		catch(Exception e)
		{
			System.out.println("You can not Divide any number by Zero .");	
		}
		
		System.out.println("I want to be executed....");
	}
}









