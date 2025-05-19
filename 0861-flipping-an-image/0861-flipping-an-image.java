class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left <= right) {
                // Flip and invert in one step
                int tempLeft = image[i][left] ^ 1;
                int tempRight = image[i][right] ^ 1;

                // Swap after invert
                image[i][left] = tempRight;
                image[i][right] = tempLeft;

                left++;
                right--;
            }
        }

        return image;
    }
}
