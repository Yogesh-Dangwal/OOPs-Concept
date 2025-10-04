package OOPS;
public class MethodOverriding {
    public static void main(String[] args) {
        Dog dogy = new Dog();
        dogy.sound();
    }
}

class Animall {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animall {
    void sound(){
        System.out.println("Dog barks");
    }
}