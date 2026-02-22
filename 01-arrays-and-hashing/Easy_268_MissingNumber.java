
/**
 * LeetCode #268 - Missing Number
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in range [0,3].
 * 2 is the missing number since it does not appear in nums.
 *
 * Example 2:
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in range [0,2].
 * 2 is the missing number.
 *
 * Example 3:
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 10^4
 * - 0 <= nums[i] <= n
 * - All numbers in nums are unique
 *
 * Follow-up: Could you implement a solution using only O(1) extra space and O(n) runtime?
 *
 * Hints to consider:
 * - Approach 1: Use HashSet to store all numbers, find missing
 * - Approach 2: Math - sum of 0 to n minus sum of array
 * - Approach 3: XOR trick (a ^ a = 0, so XOR all indices and values)
 */

import java.util.*;

public class Easy_268_MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = n * (n + 1) / 2;

        int numsSum = 0;

        for (int i = 0; i < nums.length; i++) {

            numsSum = numsSum + nums[i];

        }

        return sum - numsSum;

    }

    // Test cases
    public static void main(String[] args) {
        Easy_268_MissingNumber solution = new Easy_268_MissingNumber();

        // Test case 1
        int[] nums1 = { 3, 0, 1 };
        System.out.println("Test 1: " + solution.missingNumber(nums1)); // Expected: 2

        // Test case 2
        int[] nums2 = { 0, 1 };
        System.out.println("Test 2: " + solution.missingNumber(nums2)); // Expected: 2

        // Test case 3
        int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println("Test 3: " + solution.missingNumber(nums3)); // Expected: 8

        // Test case 4
        int[] nums4 = { 0 };
        System.out.println("Test 4: " + solution.missingNumber(nums4)); // Expected: 1
    }
}
