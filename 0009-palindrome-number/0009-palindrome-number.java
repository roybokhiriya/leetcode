class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers or numbers ending in 0 (but not 0 itself) can't be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x = x / 10;
        }

        // If x is even-length, both halves will be equal.
        // If x is odd-length, ignore the middle digit (reversedHalf / 10)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
