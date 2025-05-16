class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];              // primary diagonal
            sum += mat[i][n - 1 - i];      // secondary diagonal
        }
        
        // If n is odd, subtract the middle element once because it was counted twice
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        
        return sum;
    }
}
