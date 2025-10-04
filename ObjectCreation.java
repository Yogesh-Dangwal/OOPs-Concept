package OOPS;
public class ObjectCreation{
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.color="Yellow";
        System.out.println(p1.color);
    }
}
class Pens{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}