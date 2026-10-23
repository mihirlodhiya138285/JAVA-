class ThrowExample
{
	public static void main(String args[])
	{
		int Age = 15;
		if(Age < 18 )
		{
			throw new ArithmeticException("Age is Less than 18...");
		}

		System.out.println("You can Vote ");
	}
}