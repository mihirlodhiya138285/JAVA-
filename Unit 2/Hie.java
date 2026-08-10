class Animal
{
	void eat()
	{
		System.out.println("Can Eat");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Can Bark");
	}

	public static void main(String args[])
	{
		Dog d = new Dog();
		d.eat();
		d. bark();
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.println("Can Meow");
	}

	public static void main(String args[])
	{
		Cat c = new Cat();
		c.eat();
		c.meow();
	}

}





