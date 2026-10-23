class MyThread39 extends Thread
{
	public void run()
	{
		System.out.println("Thread created using Thread class is running.");
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		MyThread39 t1 = new MyThread39();
		t1.start();
	}
}