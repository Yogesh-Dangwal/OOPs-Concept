package OOPS;
public class MultiLvlInheritance {
   public static void main(String[] args) {
        Dog dogy = new Dog();
        dogy.eat();
        dogy.legs = 4;
        System.out.println(dogy.legs);
    }
}
class Animal {
    String color;
    
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}