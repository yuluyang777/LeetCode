package LeetCode_019;

/**
 * 删除链表的倒数第k个节点
 */
public class Method_1 {

    public static class ListNode {

        private int value;
        private ListNode next;

        public ListNode(int num){
            this.value = num;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int k){

        ListNode firstNode = head;
        ListNode lastNode = head;

        for (int i = 0; i < k; i++) {
            firstNode = firstNode.next;
        }

//        while (k-- > 0) {
//            firstNode = firstNode.next;
//        }

        if (firstNode == null) {
            return head.next;
        }

        while (firstNode != null) {
            firstNode = firstNode.next;
            lastNode = lastNode.next;
        }

        lastNode.next = lastNode.next.next;
        return head;

    }

        public static ListNode removeNthFromEnd1(ListNode head, int n) {


            ListNode firstNode = head;
            ListNode lastNode = head;

            while (n-- > 0) {
                firstNode = firstNode.next;
            }
            if (firstNode == null)  {
                return head.next;	//防止极端情况
            }

            while (firstNode.next != null) {
                firstNode = firstNode.next;
                lastNode = lastNode.next;
            }
            lastNode.next = lastNode.next.next;
            return head;

        }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode res = removeNthFromEnd(head, 1);
        printListNode(res);
    }

    public static void printListNode(ListNode head){
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
