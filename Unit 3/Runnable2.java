class Runnable3 implements Runnable
{
	public void run()
	{
		for(int i = 1; i <= 5 ; i++)
		{
			System.out.println("Mjolnir's Thread,count :" + i);
		}
	}
}

public class Runnable2
{	
	public static void main(String args[])
	{
		Runnable3 r2 = new Runnable3(); 		
		t2.start();
		Thread t2 = new Thread(r2);
	}	
}