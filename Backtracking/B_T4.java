/* ------- N-Queens : Place N queens on an N*N chessboard such that no two queens can attack each other ------- */
/* ------ Also counting total number of ways in which we can solve N-Queens problem ------- */

public class B_T4 {

    static int count = 0;

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical group
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void print_Board(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            count+=1;
            System.out.println("------Chess Board-------");
            print_Board(board);
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);// function call
                board[row][j] = 'X';// backtracking
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        System.out.println("Total number of ways in which N-Queens problem get solved is "+count);
    }
}
