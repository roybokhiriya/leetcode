import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        backtrack(0, board, result, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
        return result;
    }

    private void backtrack(int row, char[][] board, List<List<String>> result,
                           boolean[] cols, boolean[] diag1, boolean[] diag2) {
        int n = board.length;
        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;  // main diagonal index
            int d2 = row + col;      // anti-diagonal index
            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            backtrack(row + 1, board, result, cols, diag1, diag2);

            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
}
