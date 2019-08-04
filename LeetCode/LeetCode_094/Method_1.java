package LeetCode_094;

import LeetCode_100.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Method_1 {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            if (stack.isEmpty()) break;

            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
