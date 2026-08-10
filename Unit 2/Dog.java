class Animal 
{
	void eat()
	{
		System.out.print("Animal can Eat...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Woof.... Woof ....");
	}

	public static void main(String args[])
	{
		Dog d = new Dog();
		d.bark();
		d.eat();
	}	
	
}