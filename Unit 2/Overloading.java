// Method Overloading - same method name but different arguments in same class.
class Overloading {
	void square (int x, int y, int z, int v) {
		System.out.println("Square : " + (x * y * z * v));
	}

	void square (int x, int y) {
		System.out.println("Square : " + (x * y));
	}

	void square (double x, int y) {
		System.out.println("Square : " + (x * y));
	}

	void square (int x, int y, int z) {
		System.out.println("Square : " + (x * y * z));
	}

	public static void main(String args[]) {
		Overloading o = new Overloading();
		o.square(2, 5);
		o.square(2.3, 4);
		o.square(2, 1, 6, 1);
	}
}