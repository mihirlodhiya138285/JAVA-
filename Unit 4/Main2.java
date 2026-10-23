class Simple extends Thread
{
	public void run()
	{
		for(int i = 0; i<3; i++)
		{
			System.out.println("Simple : " +getName()+": " + i);
		try
		{
			sleep(1000);	
		}
		catch(Exception e){}

		}
	}

}

class Main2
{
	public static void main(String args[])
	{
		Simple s1 = new Simple();
		Simple s2 = new Simple();
		Simple s3 = new Simple();
		Simple s4 = new Simple();
		Simple s5 = new Simple();
		

		s1.setName("Instagram ");
		s2.setName("WhatsApp ");
		s3.setName("VS Code ");
		s4.setName("File Explorer ");
		s5.setName("Notepad ");
		

		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();

		
	}
}