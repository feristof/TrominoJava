public class Tromino {
    public static int[][] trominoPuzzle(int size, int missingX, int missingY) {
        // base case: if size is 2, return a tiled board with the missing square
        if (size == 2) {
            int[][] board = {{1, 1}, {1, 1}};
            board[missingX][missingY] = 0;
            return board;
        }

        int newSize = size / 2;
        int[][] board = new int[size][size];

        // divide the board into four smaller squares
        int[][] square1 = trominoPuzzle(newSize, missingX, missingY);
        int[][] square2 = trominoPuzzle(newSize, missingX, missingY - newSize);
        int[][] square3 = trominoPuzzle(newSize, missingX - newSize, missingY);
        int[][] square4 = trominoPuzzle(newSize, missingX - newSize, missingY - newSize);

        // copy the smaller squares into the larger board
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                board[i][j] = square1[i][j];
                board[i][j + newSize] = square2[i][j];
                board[i + newSize][j] = square3[i][j];
                board[i + newSize][j + newSize] = square4[i][j];
            }
        }

        // find the position of the square that needs to be tiled
        int x = 0, y = 0;
        if (missingX >= newSize) {
            x += newSize;
        }
        if (missingY >= newSize) {
            y += newSize;
        }

        // tile the square
        for (int i = x; i < x + newSize; i++) {
            for (int j = y; j < y + newSize; j++) {
                if (i == missingX && j == missingY) {
                    continue;
                }
                board[i][j] = 2;
            }
        }
        return board;
    }

    public static void main(String[] args) {
        int size = 8;
        int missingX = 2;
        int missingY = 3;
        int[][] board = trominoPuzzle(size, missingX, missingY);

        // print the tiled board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

