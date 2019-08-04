package LeetCode_111;

import LeetCode_144.TreeNode;

public class LeetCode111 {
    public static void main(String[] args) {

        TreeNode r = new TreeNode(3);
        r.left = new TreeNode(2);
        r.right = null;


    }
}

class Solution{
    public int minDepth(TreeNode root){

        if (root == null){
            return 0;
        }

        if (root.left == null & root.right ==null) {
            return 1;
        }

        if (root.left == null & root.right != null) {
            return minDepth(root.right) + 1;
        }

        if (root.left != null & root.right == null) {
            return minDepth(root.left) + 1;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return Math.min(left,right) + 1;
    }
}
