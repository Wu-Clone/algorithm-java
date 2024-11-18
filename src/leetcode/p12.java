package leetcode;

public class p12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int cntM = num / 1000;
        num = num % 1000;
        for (int i = 0; i < cntM; i++)
            sb.append('M');
        // 百
        if (num >= 900) {
            sb.append("CM");
        } else if (num >= 500) {
            num -= 500;
            sb.append('D');
            int cntC = num / 100;
            for (int i = 0; i < cntC; i++)
                sb.append('C');
        } else if (num >= 400) {
            sb.append("CD");
        } else {
            int cntC = num / 100;
            for (int i = 0; i < cntC; i++)
                sb.append('C');
        }
        num = num % 100;

        // 十
        if (num >= 90) {
            sb.append("XC");
        } else if (num >= 50) {
            num -= 50;
            sb.append('L');
            int cntX = num / 10;
            for (int i = 0; i < cntX; i++)
                sb.append('X');
        } else if (num >= 40) {
            sb.append("XL");
        } else {
            int cntX = num / 10;
            for (int i = 0; i < cntX; i++)
                sb.append('X');
        }
        num = num % 10;

        // 个
        if (num == 9) {
            sb.append("IX");
        } else if (num >= 5) {
            num -= 5;
            sb.append('V');
            int cntC = num;
            for (int i = 0; i < cntC; i++)
                sb.append('I');
        } else if (num == 4) {
            sb.append("IV");
        } else {
            int cntC = num;
            for (int i = 0; i < cntC; i++)
                sb.append('I');
        }
        return sb.toString();
    }
}
