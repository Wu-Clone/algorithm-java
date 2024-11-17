package leetcode;

public class p67 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int cf = 0;
        while (i >= 0 || j >= 0) {
            int chA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int chB = (j >= 0) ? b.charAt(j--) - '0' : 0;
            if (chA + chB + cf == 3)
                sb.append('1');
            else if (chA + chB + cf == 2) {
                sb.append('0');
                cf = 1;
            } else if (chA + chB + cf == 1) {
                sb.append('1');
                cf = 0;
            } else
                sb.append('0');
        }
        if (cf == 1)
            sb.append('1');
        return sb.reverse().toString();
    }
}
