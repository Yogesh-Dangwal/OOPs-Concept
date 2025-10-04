package OOPS;
public class Constructors {
    public static void main(String[] args) {
        Students s1 = new Students();//Non-parameterized constructor
        System.out.println(s1);
        Students s2 = new Students("Yogi", 22);//Parameterized constructor
        System.out.println("Name:"+" "+s2.name+" ,"+"Age:"+" "+s2.age);
    }
}
class Students{
    String name;
    int age;
    Students(){
        System.out.println("Non parameterized constructor called...");
    }

    Students(String name, int age){
        this.name = name;
        this.age = age;
    }
}