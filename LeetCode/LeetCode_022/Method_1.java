package LeetCode_022;

import java.util.ArrayList;
import java.util.List;

public class Method_1 {

    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        generate(list, "", 0, 0, n);

        return list;
    }

    public void generate(List<String> res, String ans, int left, int right, int n) {

        if (left == n && right == n) {
            res.add(ans);
        }

        if (left > n || right > n) {
            return;
        }

        if (left >= right) {
            generate(res, ans+"(", left+1, right, n);
            generate(res, ans +")", right, right+1, n);

        }
    }
}
