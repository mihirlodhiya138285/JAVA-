class PriorityThread extends Thread
{
	public void run()
	{
		System.out.println("Running: " + getName() + " | Priority: " + getPriority());
	}
}

class PriorityDemo
{
	public static void main(String args[])
	{
		PriorityThread t1 = new PriorityThread();
		PriorityThread t2 = new PriorityThread();

		t1.setName("LowPriorityThread");
		t2.setName("HighPriorityThread");

		t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
		t2.setPriority(Thread.MAX_PRIORITY); // Priority 10

		t1.start();
		t2.start();
	}
}