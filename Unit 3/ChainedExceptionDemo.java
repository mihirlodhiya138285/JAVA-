class ChainedExceptionDemo 
{

    static void divide() 
	{
        	try 
		{
            		int i = 10 / 0; // Original Exception (ArithmeticException)
        	} 
        	catch (ArithmeticException e) 
		{
                      NullPointerException npe = new NullPointerException("Top level exception");
            		npe.initCause(e);            
			throw npe;
        	}
    	}

    public static void main(String args[]) 
	{
        	try 
		{
           	 	divide();
        	}	 
        	catch (NullPointerException e) 
		{
        	   System.out.println("Caught Exception: " + e);

        	   System.out.println("Actual Cause: " + e.getCause());
        	}
    	}
}