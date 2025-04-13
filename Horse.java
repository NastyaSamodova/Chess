public class Horse extends ChessPiece {

    public Horse(String color) {
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


        return (dLine == 2 && dColumn == 1) || (dLine == 1 && dColumn == 2);
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}