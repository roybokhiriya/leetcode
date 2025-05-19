class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];

        // Directions for 3x3 grid
        int[] dir = {-1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;

                for (int dx : dir) {
                    for (int dy : dir) {
                        int x = i + dx;
                        int y = j + dy;

                        if (x >= 0 && x < m && y >= 0 && y < n) {
                            sum += img[x][y];
                            count++;
                        }
                    }
                }

                result[i][j] = sum / count;  // Integer division = floor
            }
        }

        return result;
    }
}
