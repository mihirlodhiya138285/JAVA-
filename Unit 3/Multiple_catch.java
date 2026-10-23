class Multiple_catch 
{
    public static void main(String args[]) 
	{
        int [] a = new int[5];

        	try 
		{
            		int i = 5/2;
            		a[10] = 10;
        	}
        	catch(ArithmeticException e) 
		{
            		System.out.println("Arithmetic Exception: " + e);
        	}
        	catch(ArrayIndexOutOfBoundsException e) 
		{
            		System.out.println("Array Index Out Of Bounds: " + e);
        	}
    	}
}
