package OOPS;
public class Abstraction {
    public static void main(String[] args) {
        Horse H = new Horse();
        H.walk();
        H.eat();
        System.out.println(H.color);
    }
}
abstract class Animal {
    String color;
    Animal() {
        color = "Brown";
        System.out.println("Animal constructor is called...");
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}
class Horse extends Animal{
    Horse() {
        System.out.println("Horse constructor is called...");
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
