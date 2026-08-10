class HelloWorld
{
	void display()
	{
		System.out.println("Hello World Display Method ");

	}

	void show(int x)
	{
		System.out.println("Show Method : "+ x);
	}

	HelloWorld()
	{
		System.out.println("This is Default Constructor...");
	}

	HelloWorld(int x)
	{
		System.out.println("This is Parameterized : "+ x);
	}	

	public static void main(String args[])
	{
		HelloWorld ob = new HelloWorld();
		HelloWorld ob2 = new HelloWorld(20);
		ob.display();
		ob.show(10);
	}	

}
