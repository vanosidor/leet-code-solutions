package valid_sudoku_36;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i / 3 + "-" + j / 3))
                        return false;
            }
        }
        return true;
    }

//    My solution
//    public boolean isValidSudoku(char[][] board) {
//
//        int[] repeatCount = new int[9];
//
//        // 1st check (rows)
//        for (int i = 0; i <= 8; i++) {
//            for (int j = 0; j <= 8; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//
//            if (!check(repeatCount)) return false;
//            clearRepeatCountArray(repeatCount);
//        }
//
//        // 2d check columns
//        for (int i = 0; i <= 8; i++) {
//            for (int j = 0; j <= 8; j++) {
//                updateRepeatCount(repeatCount, board[j][i]);
//            }
//
//            if (!check(repeatCount)) return false;
//            clearRepeatCountArray(repeatCount);
//        }
//
////        3d check - boxes
//
//        // top 1
//        for (int i = 0; i <= 2; i++) {
//            for (int j = 0; j <= 2; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//        }
//
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
//        // top 2
//        for (int i = 0; i <= 2; i++) {
//            for (int j = 3; j <= 5; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//        }
//
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
////        top 3
//        for (int i = 0; i <= 2; i++) {
//            for (int j = 6; j <= 8; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//        }
//
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
//        // middle 1
//        for (int i = 3; i <= 5; i++) {
//            for (int j = 0; j <= 2; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//
//        }
//
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
//        //middle 2
//        for (int i = 3; i <= 5; i++) {
//            for (int j = 3; j <= 5; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//        }
//
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
//
////        middle 3
//        for (int i = 3; i <= 5; i++) {
//            for (int j = 6; j <= 8; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//
//        }
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
//        // bottom 3-boxes
//        for (int i = 6; i <= 8; i++) {
//            for (int j = 0; j <= 2; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//        }
//
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
//        for (int i = 6; i <= 8; i++) {
//            for (int j = 3; j <= 5; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//        }
//
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
//        for (int i = 6; i <= 8; i++) {
//            for (int j = 6; j <= 8; j++) {
//                updateRepeatCount(repeatCount, board[i][j]);
//            }
//        }
//
//        if (!check(repeatCount)) return false;
//        clearRepeatCountArray(repeatCount);
//
//        return true;
//    }

    private void updateRepeatCount(int[] repeatCount, char symbol) {
        int num = Character.getNumericValue(symbol);

        if (num > 0 && num <= 9) {
            repeatCount[num - 1]++;
        }
    }

    private void clearRepeatCountArray(int[] repeatCount) {
        Arrays.fill(repeatCount, 0);
    }

    private boolean check(int[] repeatCount) {
        for (int repeat : repeatCount) {
            if (repeat > 1) return false;
        }
        return true;
    }
}