class Method extends Thread
{
	public void run() 
	{
		for(int i = 0; i<3; i++)
		{
			System.out.println("Method run: " + getName() + ": " + i);
		}
		try
		{
			sleep(1000);
		}
		catch(Exception e)
		{}
	}
}
class MainMethod
{
	public static void main(String args[]) ac
	{
		Method m1 = new Method();
		Method m2 = new Method();

		m1.setName("Instagram ");
		m2.setName("Whatsapp ");

		m1.start();
		m2.start();
	}
}