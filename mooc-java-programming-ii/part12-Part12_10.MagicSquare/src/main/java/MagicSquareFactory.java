public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        MagicSquare square = new MagicSquare(size);
        int values = 1;
        int row = 0;
        int col = size / 2;

        while (values <= size * size) {
            square.placeValue(col, row, values);

            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            if (square.readValue(nextCol, nextRow) != 0) {
                row = (row + 1) % size;
            } else {
                row = nextRow;
                col = nextCol;
            }
            values++;
        }

        return square;
    }
}
