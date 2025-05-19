class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            int i1 = Math.max(i - 1, 0), i2 = Math.min(i + 1, m - 1);
            for (int j = 0; j < n; j++) {
                int j1 = Math.max(j - 1, 0), j2 = Math.min(j + 1, n - 1);
                int sum = 0, count = 0;

                for (int x = i1; x <= i2; x++) {
                    for (int y = j1; y <= j2; y++) {
                        sum += img[x][y];
                        count++;
                    }
                }

                res[i][j] = sum / count;
            }
        }

        return res;
    }
}

