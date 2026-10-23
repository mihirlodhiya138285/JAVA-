class Simple extends Thread
{
	public void run()
	{
		for(int i = 0; i<3; i++)
		{
			System.out.println("Simple : " +getName()+": " + i);
		}
		try
		{
			sleep(1000);	
		}
		catch(Exception e){}
	}

}

class Main
{
	public static void main(String args[])
	{
		Simple s1 = new Simple();
		Simple s2 = new Simple();

		s1.setName("Instagram ");
		s2.setName("WhatsApp ");

		s1.start();
		s2.start();
	}
}