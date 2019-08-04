package LeetCode_237;

import LeetCode_021.ListNode;

public class LeetCode_237 {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
