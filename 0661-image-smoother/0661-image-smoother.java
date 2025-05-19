class Solution {
    public int[][] imageSmoother(int[][] img) {
        final int m = img.length, n = img[0].length;
        final int[][] res = new int[m][n];

        for (int i = 0; i < m; ++i) {
            int iMin = Math.max(i - 1, 0);
            int iMax = Math.min(i + 1, m - 1);
            for (int j = 0; j < n; ++j) {
                int jMin = Math.max(j - 1, 0);
                int jMax = Math.min(j + 1, n - 1);
                int sum = 0, count = 0;

                for (int x = iMin; x <= iMax; ++x) {
                    for (int y = jMin; y <= jMax; ++y) {
                        sum += img[x][y];
                        ++count;
                    }
                }

                res[i][j] = sum / count;
            }
        }

        return res;
    }
}
