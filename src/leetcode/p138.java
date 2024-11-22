package leetcode;

public class p138 {
    //    public Node copyRandomList(Node head) {
//        Node dummy = new Node(0);
//        Node x = dummy;
//        Node z = dummy;
//        Node y = head;
//
//        Map<Node, Node> map = new HashMap<>();
//        while(head!=null){
//            x.next = new Node(head.val);
//            x= x.next;
//            map.put(head,x);
//            head = head.next;
//        }
//        while(y!=null){
//            z.next.random = map.get(y.random);
//            z = z.next;
//            y = y.next;
//        }
//        return dummy.next;
//    }

//    public Node copyRandomList01(Node head) {
//        if (head == null) return null;
//        Map<Node, Node> map = new HashMap<>();
//        Node currOriginal = head;
//        while (currOriginal != null) {
//            map.put(currOriginal, new Node(currOriginal.val));
//            currOriginal = currOriginal.next;
//        }
//        currOriginal = head;
//        while (currOriginal != null) {
//            Node copyNode = map.get(currOriginal);
//            copyNode.next = map.get(currOriginal.next);
//            copyNode.random = map.get(currOriginal.random);
//            currOriginal = currOriginal.next;
//        }
//        return map.get(head);
//    }
}
