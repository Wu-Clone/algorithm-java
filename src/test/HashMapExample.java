package test;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // 创建 HashMap 并添加元素
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        // 获取元素
        System.out.println("apple: " + map.get("apple"));

        // 检查键是否存在
        if (map.containsKey("banana")) {
            System.out.println("banana is in the map.");
        }

        // 遍历键值对
        System.out.println("Key-Value pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 移除元素
        map.remove("orange");

        // 检查移除后的状态
        System.out.println("After removing orange:");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // 清空 HashMap
        map.clear();
        System.out.println("Is map empty? " + map.isEmpty());  // 返回 true
    }
}
