package LeetCode_048;

public class Method_2 {

    public static void rotate(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR < dR) {
            rotateEdge(matrix, tR, tC, dR, dC);
        }
    }

    public static void rotateEdge(int[][] m, int tR, int tC, int dR, int dC) {
        int times = dR - tR;
        int temp = 0;
        for (int i = 0; i < times; i++) {
            temp = m[0][i];
            m[0][i] = m[times - i][0];
            m[times - i][0] = m[times][times - i];
            m[times][times - i] = m[i][times];
            m[i][times] = temp;
        }
    }

    public static  void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        printMatrix(matrix);
        rotate(matrix);
        printMatrix(matrix);
    }
}
