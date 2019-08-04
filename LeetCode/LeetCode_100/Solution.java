package LeetCode_100;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q){

        if (p==null && q==null) {
            return true;
        } else if (p==null & q!=null) {
            return false;
        } else if (p!=null & q==null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        boolean leftISSame = isSameTree(p.left, q.left);
        boolean rightISSame = isSameTree(p.right,q.right);
        return leftISSame&rightISSame;
    }
}
