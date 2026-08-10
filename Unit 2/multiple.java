
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks: Woof Woof!");
    }
}


public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
	Dog myDog = new Dog();

        // Accessing methods from all levels of inheritance
        myDog.eat();  // Inherited from Animal
        myDog.walk(); // Inherited from Mammal
        myDog.bark(); // Defined in Dog class
    }
}