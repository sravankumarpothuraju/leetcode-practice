/**
 * LeetCode #643 - Maximum Average Subarray I
 * Difficulty: Easy
 * Pattern: Sliding Window (Fixed Size)
 *
 * Problem:
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the maximum average
 * value and return this value.
 *
 * Example 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 *
 * Example 2:
 * Input: nums = [5], k = 1
 * Output: 5.00000
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= k <= n <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 *
 * Hints to consider:
 * - Fixed size sliding window of size k
 * - Calculate sum of first k elements
 * - Slide window: subtract left, add right
 * - Track maximum sum seen
 * - Convert to average at the end
 * - O(n) time, O(1) space
 */

public class Easy_643_MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
       
        //build window first

        int windowSum = 0;

        for(int i=0; i< k; i++){

           windowSum = windowSum + nums[i];
        }

        double maxSum = windowSum;

        //slide

        for(int i=k; i< nums.length; i++){

            windowSum = windowSum+ nums[i] - nums[i-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum/k;

    }

    // Test cases
    public static void main(String[] args) {
        Easy_643_MaximumAverageSubarrayI solution = new Easy_643_MaximumAverageSubarrayI();

        // Test case 1
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        System.out.println("Test 1: " + solution.findMaxAverage(nums1, 4)); // Expected: 12.75

        // Test case 2
        int[] nums2 = {5};
        System.out.println("Test 2: " + solution.findMaxAverage(nums2, 1)); // Expected: 5.0

        // Test case 3
        int[] nums3 = {0, 4, 0, 3, 2};
        System.out.println("Test 3: " + solution.findMaxAverage(nums3, 1)); // Expected: 4.0
    }
}
