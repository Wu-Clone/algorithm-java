package leetcode;

public class p141 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        // 如果链表为空或只有一个元素，则没有环
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        // 快慢指针同时移动，判断是否相遇
        while (fast != null && fast.next != null) {
            slow = slow.next;           // 慢指针每次走一步
            fast = fast.next.next;      // 快指针每次走两步

            if (slow == fast) {         // 快慢指针相遇
                return true;            // 说明链表有环
            }
        }

        return false; // 如果快指针走到了链表末尾，说明没有环
    }

}
