package leetcode;

public class p48 {
    public void rotate(int[][] matrix) {
        // 先转置
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i != j) {
                    int tmp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int tmp = matrix[i][r];
                matrix[i][r] = matrix[i][l];
                matrix[i][l] = tmp;
                l++;
                r--;
            }
        }
    }
}
