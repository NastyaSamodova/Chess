public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (this.color.equals("White")) {
            if (line == 1 && column == toColumn && (toLine == line + 1 || toLine == line + 2)) {
                return true;
            }
            if (toLine == line + 1 && column == toColumn) {
                return true;
            }
        }
        if (this.color.equals("Black")) {
            if (line == 6 && column == toColumn && (toLine == line - 1 || toLine == line - 2)) {
                return true;
            }
            if (toLine == line - 1 && column == toColumn) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}