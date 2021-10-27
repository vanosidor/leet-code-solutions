package valid_sudoku_36;

import common.In;
import common.StdOut;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");
        String fileName = args[0];

        In in = new In(new File("src/" + Main.class.getPackage().getName() + "/" + fileName));

        Solution solution = new Solution();

        char[][] board = new char[9][9];

        for (int i = 0; i < 9; i++) {
            String line = in.readLine().replaceAll("\\s+", "");
            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        StdOut.print(solution.isValidSudoku(board));
    }
}
