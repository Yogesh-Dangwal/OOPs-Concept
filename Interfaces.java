package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.moves();
        King K = new King();
        K.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}
class King implements ChessPlayer{
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}