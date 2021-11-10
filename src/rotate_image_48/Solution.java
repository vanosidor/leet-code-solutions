package rotate_image_48;

//Нужно перевернуть двумерный массив на 90 градусов влево

//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//        Output: [[7,4,1],[8,5,2],[9,6,3]]

//1) Перевернуть относительно горизонтали
//2) Свапнуть элементы

// Другой способ:
// https://javabypatel.blogspot.com/2016/11/rotate-matrix-by-90-degrees-inplace.html

public class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // first reverse array horizontally
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }

        // swap array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }

        }
    }
}
