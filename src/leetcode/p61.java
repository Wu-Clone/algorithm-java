package leetcode;

public class p61 {
//    public ListNode rotateRight(ListNode head, int k) {
//        if(head==null || head.next == null) return head;
//        ListNode l = head;
//        ListNode r = head;
//        ListNode startNode = head;
//        int length = 0;
//        while(head!=null) {
//            head = head.next;
//            length++;
//        }
//        k %= length;
//        for(int i = 0; i<k;i++){
//            r = r.next;
//        }
//        while(r.next!=null){
//            r = r.next;
//            l = l.next;
//        }
//        r.next = startNode;
//        ListNode res = l.next;
//        l.next = null;
//        return res;
//    }
}
