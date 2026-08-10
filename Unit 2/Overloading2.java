// Method Overloading - same method name but different arguments in same class.
class Overloading2 {

	void square (int x, double y) {
		System.out.println("Square : " + (x * y));
	}

	void square (double x, int y) {
		System.out.println("Square : " + (x * y));
	}

	public static void main(String args[]) {
		Overloading2 n = new Overloading2();
		n.square(2, 90.68);
		n.square(2.3, 4);
	}
}