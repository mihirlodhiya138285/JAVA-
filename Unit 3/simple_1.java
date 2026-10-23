//Simple Java Program to implement simple Exception Handling 

class Simple_1
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Hello World ...");
			int i = 10/0;

			System.out.println(i);
			System.out.println("Thank You.....");
	
		}
		
		catch(Exception e )
		{
			System.out.println("e");
			System.out.println("Error...");
		}
	}
}