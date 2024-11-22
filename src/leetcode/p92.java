package leetcode;

public class p92 {
    // 注意：翻转节点，而不是值
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        // ListNode 非空
//        int index = 0;
//        ListNode dummy = new ListNode(0,head);
//        ListNode foo = dummy;
//        ListNode startNode = dummy;
//        Stack<ListNode> stack = new Stack<>();
//
//        while(index<left){
//            startNode = foo;
//            foo = foo.next;
//            index++;
//        }
//
//        // 循环次数
//        while(index<=right){
//            stack.push(foo);
//            foo = foo.next;
//            index++;
//        }
//        // 此时foo指向队尾，就算是null也OK
//        while(!stack.isEmpty()){
//            startNode.next = stack.pop();
//            startNode = startNode.next;
//        }
//        startNode.next = foo;
//        return dummy.next;
//    }

//    public ListNode reverseBetween01(ListNode head, int left, int right) {
//        // 哑节点简化操作
//        ListNode dummy = new ListNode(0, head);
//        ListNode pre = dummy;
//
//        // 移动 pre 到第 left 节点的前驱
//        for (int i = 1; i < left; i++) {
//            pre = pre.next;
//        }
//
//        // 反转从 left 到 right 的节点
//        ListNode curr = pre.next; // 当前节点
//        ListNode next = null;
//        for (int i = 0; i < right - left; i++) {
//            next = curr.next; // 暂存 next 节点
//            curr.next = next.next; // 跳过 next 节点
//            next.next = pre.next; // 插入到 pre 的后面
//            pre.next = next; // 更新 pre 的 next 指向
//        }
//
//        return dummy.next;
//    }

}
