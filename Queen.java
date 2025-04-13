public class Queen extends ChessPiece {

    public Queen(String color) {
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


        return (dLine == 0 && dColumn > 0) || (dColumn == 0 && dLine > 0) || (dLine == dColumn);
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}