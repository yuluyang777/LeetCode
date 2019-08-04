package LeetCode_098;

import LeetCode_100.TreeNode;

public class Method_1 {

    public boolean isValidBST(TreeNode root) {

        boolean flag = true;

        if (root == null) {
            return flag;
        }

        if (root.left != null && root.right != null) {
            if (root.val < root.left.val || root.val > root.right.val) {
                flag = false;
            } else {
                flag = isValidBST(root.left) && isValidBST(root.right);
            }
        }

        return flag;
    }
}
