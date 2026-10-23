class MyException extends Exception 
{
    public MyException(String msg) 
	{
        super(msg);
    	}
}
class CustomException
{
    public static void main(String args[]) 
	{
        	try 
		{
            		System.out.println("Hello World ...");
            
           
           		throw new MyException("This is my custom error!");

        	} 
		catch (MyException e) 
		{
            		System.out.println(e.getMessage());
            		System.out.println("Error handled...");
        	}
    	}
}