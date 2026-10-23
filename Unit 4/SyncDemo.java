class Counter
{
	int count = 0;

	// Synchronized method to make it thread safe
	public synchronized void increment()
	{
		count++;
	}
}

class SyncThread extends Thread
{
	Counter c;

	SyncThread(Counter c)
	{
		this.c = c;
	}

	public void run()
	{
		for(int i = 0; i < 3; i++)
		{
			c.increment();
		}
	}
}

class SyncDemo
{
	public static void main(String args[])
	{
		Counter c = new Counter();
		SyncThread t1 = new SyncThread(c);
		SyncThread t2 = new SyncThread(c);

		t1.start();
		t2.start();

		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{}

		System.out.println("Final Synchronized Count: " + c.count);
	}
}