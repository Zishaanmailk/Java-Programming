// Base class
class Animal {
    void speak() {
        System.out.println("Animals make sounds.");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog says: Woof woof!");
    }
}

// Derived class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat say s: Meow meow!");
    }
}

// Main class to test hierarchical inheritance
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog behavior:");
        dog.speak();  // inherited from Animal
        dog.bark();   // specific to Dog

        System.out.println("\nCat behavior:");
        cat.speak();  // inherited from Animal
        cat.meow();   // specific to Cat
                
    }
}