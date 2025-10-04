package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse H = new Horse();
    }
}
class Animal {
    Animal() {
        System.out.println("Animal constructor is called...");
    }
}
class Horse extends Animal{
    Horse() {
        super();
        System.out.println("Horse constructor is called...");
    }
}
