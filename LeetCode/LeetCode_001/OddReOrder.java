package LeetCode_001;

import java.util.Scanner;

public class OddReOrder {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//总人数
        int[] arrScore = new int[n];//每个人的成绩
        for (int i = 0; i < n; i++) {
            arrScore[i] = in.nextInt();
        }

//        for(int i : arr) {
//            System.out.println(i);
//        }3

        int q = in.nextInt();
        int[] check = new int[q];//每个人的成绩//总查询次数
        for (int i = 0; i < q; i++) {
            check[i] = in.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int lessCount = 0;
            for (int j = 0; j < arrScore.length; j++) {
                if (arrScore[check[i] - 1] >= arrScore[j]) {
                    lessCount++;
                }
            }
            double ans = (double)(lessCount - 1) / n;
            System.out.printf( "%.6f", ans * 100);
            System.out.println();
        }
    }
}
