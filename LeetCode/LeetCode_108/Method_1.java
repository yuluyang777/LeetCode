package LeetCode_108;

import LeetCode_100.TreeNode;

import java.util.Arrays;

public class Method_1 {

    public static TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) {
            return null;
        }

        int mid = nums.length / 2;
        TreeNode res = new TreeNode(nums[mid]);

        int[] leftNums = Arrays.copyOfRange(nums, 0, mid);
        int[] rightNums = Arrays.copyOfRange(nums, mid + 1, nums.length);
        res.left = sortedArrayToBST(leftNums);
        res.right = sortedArrayToBST(rightNums);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode tn = sortedArrayToBST(arr);
    }
}
