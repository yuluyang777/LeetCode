package LeetCode_461;

public class Method_1 {

    public int hammingDistance(int x, int y) {

        int res = x ^ y;
        int count = 0;

        while (res != 0) {
            count++;
            res &= res - 1;
        }
//        return res;

        return Integer.bitCount(x ^ y);
    }


}
