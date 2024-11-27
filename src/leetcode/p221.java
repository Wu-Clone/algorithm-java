package leetcode;

public class p221 {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != '0') {
                    if (i == 0 || j == 0) {
                        max = Math.max(max, 1);

                    }
                    else{
                        int len = Math.min(Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]), matrix[i][j - 1]) - '0' + 1;
                        matrix[i][j] = (char) (len + '0');
                        max = Math.max(len * len, max);
                    }
                }
            }
        }
        return max;
    }
}
