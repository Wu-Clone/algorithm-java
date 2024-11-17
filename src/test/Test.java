package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

        System.out.println("集合的使用");
        Set<Integer> s = new HashSet<>();
        s.add(1);
        if(s.contains(1)) System.out.println("存在");
    }
}
