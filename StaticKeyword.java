package OOPS;
public class StaticKeyword {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.Address = "Delhi";
        Person p2 =  new Person();
        p2.Address = "UP";
        System.out.println(p1.Address);
        // Person p1 = new Person();
        // System.out.println(p1.calcPercent(100,95,98));
    }
}
class Person {
    static int calcPercent(int math, int phy, int chem){ //static method or function
        return (math + phy + chem) / 3;
    }
    String name;

    static String Address; //static variable or properties

    void setName(String name){
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}