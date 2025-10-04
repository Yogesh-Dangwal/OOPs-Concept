package OOPS;
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.breathes();
        f.eat();
    }
}
class Animal {
    String color;
    
    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
