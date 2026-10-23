class Hello implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
		System.out.println("Thread count: " + i);
		}
	}
}
public class RunnableExample
{
	public static void main(String args[])
	{
		Hello h = new Hello();
		Thread t2 = new Thread(h);
		t2.start();
	}
}