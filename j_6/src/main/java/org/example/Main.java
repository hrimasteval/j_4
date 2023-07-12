package org.example;
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();                                       // creates instance of Dog
        System.out.println("Dog:");
        dog.eat();                                                 // prints methods
        dog.bark();
        System.out.println();
        Cat cat = new Cat();                                       // creates instance of Cat
        System.out.println("Cat:");
        cat.eat();                                                 // prints methods
        cat.meow();
    }
}