class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;

        // Step 1: Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        // Step 2: Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Return the maximum average
        return maxSum / k;
    }
}
