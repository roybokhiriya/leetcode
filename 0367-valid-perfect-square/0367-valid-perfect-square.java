class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        return binarySearch(num, 2, num / 2);
    }

    private boolean binarySearch(int num, long left, long right) {
        if (left > right) return false;

        long mid = left + (right - left) / 2;
        long square = mid * mid;

        if (square == num) return true;
        else if (square < num) return binarySearch(num, mid + 1, right);
        else return binarySearch(num, left, mid - 1);
    }
}
