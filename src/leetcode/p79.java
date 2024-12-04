package leetcode;

public class p79 {
    class Solution {
        private boolean[][] visited;
        private int[] dx = new int[] { 1, 0, -1, 0 };
        private int[] dy = new int[] { 0, -1, 0, 1 };

        public boolean exist(char[][] board, String word) {
            visited = new boolean[board.length][board[0].length];
            char[] chs = word.toCharArray();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    visited[i][j] = true;
                    if (board[i][j] == chs[0] && backtrack(board, i, j, chs, 1))
                        return true;
                    visited[i][j] = false;
                }
            }
            return false;
        }

        private boolean backtrack(char[][] board, int i, int j, char[] chs, int match) {
            if (match == chs.length) {
                return true;
            }
            for (int t = 0; t < 4; t++) {
                int new_x = i + dx[t];
                int new_y = j + dy[t];
                if (new_x < 0 || new_x >= board.length)
                    continue;
                if (new_y < 0 || new_y >= board[0].length)
                    continue;
                if (board[new_x][new_y] != chs[match] || visited[new_x][new_y] == true)
                    continue;
                visited[new_x][new_y] = true;
                if (backtrack(board, new_x, new_y, chs, match + 1))
                    return true;
                visited[new_x][new_y] = false;
            }
            return false;
        }
    }
}
