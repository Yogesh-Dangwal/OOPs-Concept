package OOPS;
public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.displayA();
        obj.displayB();
        obj.displayD();
    }
}
    class A {
        void displayA() {
            System.out.println("Class A");
        }
    }
    
    class B extends A {
        void displayB() {
            System.out.println("Class B");
        }
    }

    class C extends A {
        void displayC() {
            System.out.println("Class C");
        }
    }
    
    class D extends B {
        void displayD() {
            System.out.println("Class D");
        }
    }
