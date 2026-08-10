class MethodDemo
{
	void square(int x, int y, int z, int v)
	{
		System.out.println("Square: " + (x*y*z*v));
	}
	void square(int x,int y)
	{
		System.out.println("Square: " + (x*y));
	}
	void square(double x,int y)
	{
		System.out.println("Square: " + (x*y));
	}
	void square(int 