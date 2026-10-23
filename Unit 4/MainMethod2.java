class Method extends Thread
{
	public void run() 
	{
		for(int i = 0; i<3; i++)
		{
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
			}
			System.out.println("Method run: " + getName() + ": " + i);
		}
	}
}
class MainMethod2
{
	public static void main(String args[]) 
	{
		Method m1 = new Method();
		Method m2 = new Method();
		Method m3 = new Method();
		Method m4 = new Method();
		Method m5 = new Method();

		m1.setName("Thread-1");
		m2.setName("Thread-2");
		m2.setName("Thread-3");
		m2.setName("Thread-4");
		m2.setName("Thread-5");

		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
	}
}