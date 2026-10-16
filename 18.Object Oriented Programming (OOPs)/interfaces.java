public class interfaces {
    public static void main(String[] args) {
        Queen Q1 = new Queen();
        Q1.moves();

        Rook R1 = new Rook();
        R1.moves();

        King K1 = new King();
        K1.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right,diagonal (in all four direction)");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by 1 Step)");
    }
}