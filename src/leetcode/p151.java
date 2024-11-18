package leetcode;

public class p151 {
    public String reverseWords(String s) {
        String[] wordsRaw = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = wordsRaw.length - 1; i >= 0; i--) {
            if (wordsRaw[i].equals("")) continue;
            sb.append(wordsRaw[i] + " ");
        }
        return sb.toString().trim();
    }

    public String reverseWords01(String s) {
        char[] initialArr = s.toCharArray();
        // +1
        char[] res = new char[initialArr.length + 1];
        int resPos = 0;
        int i = initialArr.length - 1;
        while (i >= 0) {
            while (i >= 0 && initialArr[i] == ' ') i--;
            int right = i;
            while (i >= 0 && initialArr[i] != ' ') i--;
            for (int j = i + 1; j <= right; j++) {
                res[resPos++] = initialArr[j];
                if (j == right) res[resPos++] = ' ';
            }
        }
        if (resPos == 0) return "";
        else return new String(res, 0, resPos - 1);

    }

}
