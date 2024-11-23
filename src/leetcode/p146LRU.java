package leetcode;

import java.util.HashMap;

public class p146LRU {
    private class Node{
        int key,val;
        Node next,prev;
        public Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    private HashMap<Integer, Node> map;
    private Node head, tail;
    private int capacity;

    // 构建capacity缓存
    public p146LRU(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    // 是否存在，存在返回，否则-1
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        moveTohead(node);
        return node.val;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            moveTohead(node);
        }else{
            if(map.size() == capacity){
                removeTail();
            }
            Node newNode = new Node(key, value);
            map.put(key,newNode);
            addToHead(newNode);
        }
    }

    private void moveTohead(Node node){
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node){
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void removeTail(){
        Node node = tail.prev;
        removeNode(node);
        map.remove(node.key);
    }

    public static void main(String[] args) {
        p146LRU lruCache = new p146LRU(2);
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
    }

}
