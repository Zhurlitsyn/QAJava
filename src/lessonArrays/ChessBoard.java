package lesson4;

public class ChessBoard {

    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = "W";
                } else chess[i][j] = "B";
            }
        }
        ArrayRandom.print2DArray(chess);

    }
}
