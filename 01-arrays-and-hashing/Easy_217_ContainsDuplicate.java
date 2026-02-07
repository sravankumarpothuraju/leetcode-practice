/**
 * LeetCode #217 - Contains Duplicate
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 *
 * Hints to consider:
 * - What data structure automatically handles uniqueness?
 * - Can you solve it in one pass through the array?
 * - Think about when you can return early
 */

import java.util.*;

public class Easy_217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Easy_217_ContainsDuplicate solution = new Easy_217_ContainsDuplicate();

        // Test case 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + solution.containsDuplicate(nums1)); // Expected: true

        // Test case 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test 2: " + solution.containsDuplicate(nums2)); // Expected: false

        // Test case 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test 3: " + solution.containsDuplicate(nums3)); // Expected: true

        // Test case 4 - Edge case: single element
        int[] nums4 = {1};
        System.out.println("Test 4: " + solution.containsDuplicate(nums4)); // Expected: false
    }
}
