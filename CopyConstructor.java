package OOPS;
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Yogi";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 95;

        Student s2 = new Student(s1);
        s1.marks[1] = 95;
        
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int marks[];
    //copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
} 