/**
 * LeetCode #1984 - Minimum Difference Between Highest and Lowest of K Scores
 * Difficulty: Easy
 * Pattern: Sorting + Sliding Window
 *
 * Problem:
 * You are given a 0-indexed integer array nums, where nums[i] represents the score of
 * the ith student. You are also given an integer k.
 *
 * Pick the scores of any k students from the array so that the difference between the
 * highest and the lowest of the k scores is minimized.
 *
 * Return the minimum possible difference.
 *
 * Example 1:
 * Input: nums = [90], k = 1
 * Output: 0
 * Explanation: There is one way to pick score(s) of one student: [90]. The difference
 * between the highest and lowest score is 90 - 90 = 0.
 *
 * Example 2:
 * Input: nums = [9,4,1,7], k = 2
 * Output: 2
 * Explanation: There are six ways to pick score(s) of two students:
 * [9,4], [9,1], [9,7], [4,1], [4,7], and [1,7].
 * The minimum possible difference is min(5, 8, 2, 3, 3, 6) = 2.
 *
 * Constraints:
 * - 1 <= k <= nums.length <= 1000
 * - 0 <= nums[i] <= 10^5
 *
 * Hints to consider:
 * - Sort the array first
 * - In sorted array, minimum difference will be in consecutive k elements
 * - Sliding window of size k
 * - For each window, difference = nums[i+k-1] - nums[i]
 * - Track minimum difference
 * - O(n log n) time for sorting
 */

import java.util.*;

public class Easy_1984_MinimumDifferenceBetweenHighestAndLowest {

    public int minimumDifference(int[] nums, int k) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Easy_1984_MinimumDifferenceBetweenHighestAndLowest solution = new Easy_1984_MinimumDifferenceBetweenHighestAndLowest();

        // Test case 1
        int[] nums1 = {90};
        System.out.println("Test 1: " + solution.minimumDifference(nums1, 1)); // Expected: 0

        // Test case 2
        int[] nums2 = {9, 4, 1, 7};
        System.out.println("Test 2: " + solution.minimumDifference(nums2, 2)); // Expected: 2

        // Test case 3
        int[] nums3 = {87063, 61094, 44530, 21297, 95857, 93551, 9918};
        System.out.println("Test 3: " + solution.minimumDifference(nums3, 6)); // Expected: 74560
    }
}
