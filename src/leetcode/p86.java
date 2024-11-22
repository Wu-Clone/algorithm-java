package leetcode;

public class p86 {
//    public ListNode partition(ListNode head, int x) {
//        if(head==null || head.next==null) return head;
//        ListNode bigDummy = new ListNode(x);
//        ListNode b = bigDummy;
//        ListNode smallDummy = new ListNode(0);
//        ListNode s = smallDummy;
//
//        while(head!=null){
//            if(head.val >= x){
//                b.next = head;
//                b = b.next;
//            }else{
//                s.next = head;
//                s = s.next;
//            }
//            head = head.next;
//        }
//        b.next =null;
//        // 连接
//        s.next = bigDummy.next;
//        return smallDummy.next;
//    }
}
