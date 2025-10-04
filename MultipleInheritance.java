package OOPS;
public class MultipleInheritance {
    public static void main(String[] args) {
        Bear B = new Bear();
        B.eatPlants();
        B.eatMeat();
    }
}
interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear is eating berries and plants.");
    }
    public void eatMeat() {
        System.out.println("Bear is eating fish and meat.");
    }
}