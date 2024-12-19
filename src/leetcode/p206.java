package leetcode;

public class p206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        // 递归终止条件：链表为空或只有一个节点
        if (head == null || head.next == null) {
            return head;
        }
        // 递归反转后续链表
        ListNode newHead = reverseList(head.next);
        // 反转当前节点的指针
        head.next.next = head;
        head.next = null; // 防止形成环
        return newHead; // 返回新的头结点
    }
}
