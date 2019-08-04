package LeetCode_054;

import java.util.LinkedList;
import java.util.List;

/**
 * 螺旋矩阵
 */
public class Method_1 {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new LinkedList<>();

        if (matrix.length == 0) {
            return list;
        }

        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;

        while (tR <= dR && tC <= dC) {
            List<Integer> res = rotateEdge(matrix, tR++, tC++, dR--, dC--);
            for (int i = 0; i < res.size(); i++) {
                list.add(res.get(i));
            }
        }
        return list;
    }

    public static List<Integer> rotateEdge(int[][] matrix, int tR, int tC, int dR, int dC) {

        List<Integer> list = new LinkedList<>();

        if (tR == dR) {
            for (int i = tC; i <= dC; i++) {
                list.add(matrix[tR][i]);
            }
        } else if (tC == dC) {
            for (int i = tR; i <= dR; i++) {
                list.add(matrix[i][tC]);
            }
        } else {
            int curR = tR;
            int curC = tC;
            while (curC != dC) {
                list.add(matrix[tR][curC]);
                curC++;
            }
            while (curR != dR) {
                list.add(matrix[curR][dC]);
                curR++;
            }
            while (curC > tC) {
                list.add(matrix[dR][curC]);
                curC--;
            }
            while (curR > tR) {
                list.add(matrix[curR][tC]);
                curR--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        int[][] matrix = {};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> res = spiralOrder(matrix);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + ",");
        }
    }
}
