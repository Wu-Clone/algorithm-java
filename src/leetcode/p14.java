package leetcode;

public class p14 {
    public String longestCommonPrefix(String[] strs) {
        char[] chs = strs[0].toCharArray();
        int tailIndex = chs.length - 1;
        for (int i = 1; i < strs.length; i++) {
            // 如果尾部触底
            if (tailIndex == -1)
                return "";
            int sIndex = strs[i].length() - 1;
            // 通过比对的String长度，更新tailIndex
            tailIndex = (tailIndex >= sIndex) ? sIndex : tailIndex;
            for (int j = 0; j <= tailIndex; j++) {
                if (strs[i].charAt(j) == chs[j])
                    continue;
                // j处比对失败
                tailIndex = j - 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= tailIndex; i++) {
            sb.append(chs[i]);
        }
        return sb.toString();
    }
}
