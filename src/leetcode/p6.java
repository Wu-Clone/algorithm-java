package leetcode;

public class p6 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder res = new StringBuilder();
        StringBuilder[] sbs = new StringBuilder[numRows];

        // 初始化每个元素
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        boolean down = true;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (down) {
                sbs[index].append(s.charAt(i));
                index++;
                if (index == numRows) {
                    index -= 2;
                    down = !down;
                }
            } else {
                sbs[index].append(s.charAt(i));
                index--;
                if (index < 0) {
                    index = 1;
                    down = !down;
                }
            }
        }
        for (StringBuilder sb : sbs) {
            res.append(sb);
        }
        return res.toString();
    }
}
