
/**
 * LeetCode #238 - Product of Array Except Self
 * Difficulty: Medium
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Explanation:
 * - answer[0] = 2*3*4 = 24
 * - answer[1] = 1*3*4 = 12
 * - answer[2] = 1*2*4 = 8
 * - answer[3] = 1*2*3 = 6
 *
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 * Constraints:
 * - 2 <= nums.length <= 10^5
 * - -30 <= nums[i] <= 30
 * - The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer
 *
 * Follow-up: Can you solve it in O(1) extra space complexity?
 * (The output array does not count as extra space)
 *
 * Hints to consider:
 * - Think about prefix products (product of all elements before i)
 * - Think about suffix products (product of all elements after i)
 * - For each position: answer[i] = prefix[i] * suffix[i]
 * - Can you build prefix and suffix in the output array itself?
 */

import java.util.*;

public class Medium_238_ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        // Build left array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Build right array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) { //
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Build answer
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;

    }

    // Test cases
    public static void main(String[] args) {
        Medium_238_ProductOfArrayExceptSelf solution = new Medium_238_ProductOfArrayExceptSelf();

        // Test case 1
        int[] nums1 = { 1, 2, 3, 4 };
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.println("Test 1: " + Arrays.toString(result1)); // Expected: [24,12,8,6]

        // Test case 2
        int[] nums2 = { -1, 1, 0, -3, 3 };
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.println("Test 2: " + Arrays.toString(result2)); // Expected: [0,0,9,0,0]

        // Test case 3
        int[] nums3 = { 2, 3, 4, 5 };
        int[] result3 = solution.productExceptSelf(nums3);
        System.out.println("Test 3: " + Arrays.toString(result3)); // Expected: [60,40,30,24]
    }
}
