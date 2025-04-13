public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        int dLine = Math.abs(toLine - line);
        int dColumn = Math.abs(toColumn - column);


        return dLine == dColumn;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}