package leetcode;

public class p13 {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            // 获取当前字符
            char ch = s.charAt(i);
            int tmp = parse(ch);
            // 将相同的字符收集起来
            while (i < s.length() - 1 && ch == s.charAt(i + 1)) {
                tmp += parse(ch);
                i++;
            }
            // 如果没有下一位
            if (i == s.length() - 1)
                res += tmp;
                // 和下一位相比较
            else if (tmp < parse(s.charAt(i + 1))) {
                res -= tmp;
            } else {
                res += tmp;
            }
        }
        return res;
    }

    public static int parse(char ch) {
        if (ch == 'I')
            return 1;
        if (ch == 'V')
            return 5;
        if (ch == 'X')
            return 10;
        if (ch == 'L')
            return 50;
        if (ch == 'C')
            return 100;
        if (ch == 'D')
            return 500;
        if (ch == 'M')
            return 1000;
        return 0;
    }
}
