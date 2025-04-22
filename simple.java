
class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class simple {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Inherited methods from Animal
        myDog.eat();
        // Own method in Dog
        myDog.bark();
    }
}

