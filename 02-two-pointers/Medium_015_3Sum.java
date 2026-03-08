/**
 * LeetCode #15 - 3Sum
 * Difficulty: Medium
 * Pattern: Two Pointers
 *
 * Problem:
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Example 1:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 *
 * Example 2:
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 *
 * Example 3:
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 *
 * Constraints:
 * - 3 <= nums.length <= 3000
 * - -10^5 <= nums[i] <= 10^5
 *
 * Hints to consider:
 * - Sort the array first!
 * - For each element nums[i], find two elements that sum to -nums[i]
 * - Use two pointers for the two-sum part
 * - Skip duplicates to avoid duplicate triplets
 * - O(n²) time, O(1) space (not counting output)
 */

import java.util.*;

public class Medium_015_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Medium_015_3Sum solution = new Medium_015_3Sum();

        // Test case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Test 1: " + solution.threeSum(nums1));
        // Expected: [[-1,-1,2],[-1,0,1]]

        // Test case 2
        int[] nums2 = {0, 1, 1};
        System.out.println("Test 2: " + solution.threeSum(nums2));
        // Expected: []

        // Test case 3
        int[] nums3 = {0, 0, 0};
        System.out.println("Test 3: " + solution.threeSum(nums3));
        // Expected: [[0,0,0]]
    }
}
