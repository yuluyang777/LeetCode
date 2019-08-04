package LeetCode_101;

import LeetCode_100.TreeNode;

public class Method_1 {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return test(root.left, root.right);

    }

    public boolean test(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            return test(p.right, q.left) && test(p.left, q.right);
        }

        return false;
    }
}
