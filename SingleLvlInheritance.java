package OOPS;
public class SingleLvlInheritance {
    public static void main(String[] args) {
        Fishes shark = new Fishes();
        shark.eat();
    }
}
class Animals{
    String color;
    
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Fishes extends Animals{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}