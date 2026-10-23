class LoopThread extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 3; i++)
		{
			System.out.println(getName() + " loop count: " + i);
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{}
		}
	}
}

class JoinDemo
{
	public static void main(String args[])
	{
		LoopThread t1 = new LoopThread();
		LoopThread t2 = new LoopThread();

		t1.setName("Thread-A");
		t2.setName("Thread-B");

		t1.start();
		t2.start();

		try
		{
			t1.join(); // Main thread waits for t1 to finish
			t2.join(); // Main thread waits for t2 to finish
		}
		catch(Exception e)
		{}

		System.out.println("Both threads completed. Main method exiting.");
	}
}