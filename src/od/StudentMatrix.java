package od;

import java.util.Scanner;

public class StudentMatrix {
    private static int maxCount = 0;
    private static int[][] direction = {{0, 1}, {1, 0}, {1, 1}, {1, -1}};
//    private static boolean[][] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] firstLine = in.nextLine().split(",");
        int m = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] row = in.nextLine().split(",");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = row[j].charAt(0) == 'M' ? 1 : 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    maxCount = Math.max(maxCount, dfs(matrix, i, j));
                }
            }
        }
        System.out.println(maxCount);
    }

    private static int dfs(int[][] matrix, int i, int j) {
        int res = 1;
        for (int[] dir : direction) {
            int newX = i+dir[0];
            int newY = j+dir[1];
            int score = 1;
            while (newX >= 0 && newY >= 0 && newX < matrix.length && newY < matrix[0].length
                    && matrix[newX][newY] == 1) {
                score++;
                newX += dir[0];
                newY += dir[1];
            }
            res = Math.max(score, res);
        }
        return res;
    }
}
