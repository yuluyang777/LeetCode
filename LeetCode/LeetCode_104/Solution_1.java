package LeetCode_104;

public class Solution_1 {
    public static void main(String[] args) {

    }
}

class Souution{
    public int maxDepth(TreeNode root){

        if (root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}

