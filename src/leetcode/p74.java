package leetcode;

public class p74 {
    public static void main(String[] args) {
        searchMatrix(new int[][]{
                {1,3},
        },3);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int u = 0, d = matrix.length-1;
        while(u<=d){
            int midRow = u + (d-u)/2;
            if(matrix[midRow][0] < target){
                u = midRow+1;
            }else if(matrix[midRow][0]> target){
                d = midRow-1;
            }else return true;
        }
        //此时的u指向下一位置，但是我需要的是上一位置
        // u == 0
        if(u==0) return false;
        u--;
        int l = 0, r = matrix[0].length-1;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(matrix[u][mid] > target){
                r = mid-1;
            }else if(matrix[u][mid] < target){
                l = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
