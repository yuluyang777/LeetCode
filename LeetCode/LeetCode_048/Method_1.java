package LeetCode_048;

public class Method_1 {

    public void rotate(int[][] matrix) {
        int tmp;
        int chang = matrix.length;
        for (int i = 0; i < chang; i++) {
            for (int j = 0; j < chang; j++) {
                if (i > j){
                    tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }

        for (int i = 0; i < chang; i++) {
            for (int j = 0; j < chang; j++) {
                if (j < chang/2) {
                    tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][chang-1-j];
                    matrix[i][chang-1-j] = tmp;
                }
            }
        }
    }
}
