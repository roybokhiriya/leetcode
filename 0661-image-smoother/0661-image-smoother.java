class Solution {
    public int[][] imageSmoother(int[][] img) {
        final int m = img.length;
        final int n = img[0].length;
        final int[][] result = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int sum = 0, count = 0;

                for (int x = i - 1; x <= i + 1; ++x) {
                    if (x < 0 || x >= m) continue;

                    for (int y = j - 1; y <= j + 1; ++y) {
                        if (y < 0 || y >= n) continue;

                        sum += img[x][y];
                        count++;
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
}
