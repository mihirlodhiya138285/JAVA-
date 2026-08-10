// Single inheritance
class Animal {
	void Bark() {
		System.out.println("Dog can bark");
	}
}

class Dog extends Animal{
	void animal {
		System.out.println("Dog is as animal.");
	}
	public static void main(String args[]) {
		Dog d = new Dog();
		d.animal();
		d.bark();
	}
}