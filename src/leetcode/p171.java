package leetcode;

public class p171 {
    public int titleToNumber(String columnTitle) {
        // String title = columnTitle.split("\"")[1];
        char[] chs = columnTitle.toCharArray();
        int res = 0;
        for(int i = 0; i< chs.length;i++){
            res*=26;
            int num = chs[i] - 'A' +1;
            res+=num;
        }
        return res;
    }
}
