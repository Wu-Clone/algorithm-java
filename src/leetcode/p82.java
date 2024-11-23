package leetcode;

public class p82 {
    //    public ListNode deleteDuplicates(ListNode head) {
//        ListNode dummy = new ListNode(0,head);
//        Map<Integer, Integer> map = new HashMap<>();
//        while(head!=null){
//            // if(map.containsKey(head.val)){
//            //     map.put(head.val, map.get(head.val) + 1);
//            // }
//            // else map.put(head.val, 1);
//            map.put(head.val, (map.containsKey(head.val))?map.get(head.val) + 1: 1);
//            head = head.next;
//        }
//        ListNode start = dummy;
//        while(start!=null){
//            if(start.next != null &&map.get(start.next.val)==1){
//                start = start.next;
//            }else if(start.next!=null){
//                start.next = start.next.next;
//            }else{
//                break;
//            }
//        }
//        return dummy.next;
//    }
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) return null;
//        ListNode dummy = new ListNode(0, head);
//        ListNode l = dummy;
//        ListNode r = head;
//        while (r != null && r.next != null) {
//            if (r.val == r.next.val) {
//                int val = r.val;
//                while (r != null && r.val == val)
//                    r = r.next;
//                // 1 3 4 4 5 5
//                // 1 3 5 5
//                // 1 3
//                l.next = r;
//            } else {
//                // 1 3 4 4 5 5
//                // | |
//                l = r;
//                r = r.next;
//            }
//        }
//        return dummy.next;
//    }
}
