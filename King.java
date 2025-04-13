public class King extends ChessPiece {

    public King(String color) {
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

        return dLine <= 1 && dColumn <= 1;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}