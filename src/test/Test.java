package test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        System.out.println("数组复制");
//        int[] a = {1,2,3,4,5,6};
//        int[] b = new int[a.length+1];
//        System.arraycopy(a,0,b,1,a.length);
//        System.out.println(Arrays.toString(b));

//        System.out.println("强制转换");
//        double sqrt = Math.sqrt(144);
//        System.out.println((int)sqrt);

//        System.out.println("集合的使用");
//        Set<Integer> s = new HashSet<>();
//        s.add(1);
//        if(s.contains(1)) System.out.println("存在");

//        System.out.println("HashMap的基本使用");
//        Map<Integer,Integer> m = new HashMap<>();
//        m.put(1,2);
//        m.put(3,4);
//        m.put(5,6);
//        System.out.println("获取元素：");
//        Integer i = m.get(1);
//        System.out.println(i);
//        System.out.println("判断键是否存在");
//        System.out.printf(String.valueOf(m.containsKey(1)));
//        System.out.println("移除元素");
//        m.remove(1);
//        System.out.println(m);

//        System.out.println("String Builder的test");
//        StringBuilder sb = new StringBuilder();
//        sb.append('c');
//        sb.append('a').append('d');
//        System.out.println(sb.toString());

        System.out.println("字符串修剪");
        String a = "1asd  ";
        System.out.println(a.trim());

        char[] chs = a.toCharArray();
        System.out.println(Arrays.toString(chs));

        StringBuilder sb = new StringBuilder();

        System.out.println("swd".contains("w"));

    }
}
