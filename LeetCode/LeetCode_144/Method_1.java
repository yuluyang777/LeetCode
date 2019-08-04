package LeetCode_144;

import LeetCode_100.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Method_1 {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        while (true) {
            while (root != null) {
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }

            if (stack.isEmpty()) break;

            root = stack.pop();

            root = root.right;
        }
        return list;
    }
}
