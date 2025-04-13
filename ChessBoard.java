public class ChessBoard {
    public ChessPiece[][] board;
    public String nowPlayer;


    public ChessBoard(String firstPlayer) {
        board = new ChessPiece[8][8];
        this.nowPlayer = firstPlayer;
    }


    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[" + board[i][j].getSymbol() + "]");
                }
            }
            System.out.println();
        }
    }


    public boolean moveToPosition(int line, int column, int toLine, int toColumn) {
        ChessPiece piece = board[line][column];
        if (piece == null) {
            return false;
        }


        if (piece.canMoveToPosition(this, line, column, toLine, toColumn)) {

            board[toLine][toColumn] = piece;
            board[line][column] = null;
            return true;
        }
        return false;
    }


    public boolean castling0() {

        return false;
    }


    public boolean castling7() {

        return false;
    }
}