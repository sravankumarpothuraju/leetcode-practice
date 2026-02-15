
/**
 * LeetCode #169 - Majority Element
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 5 * 10^4
 * - -10^9 <= nums[i] <= 10^9
 *
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 *
 * Hints to consider:
 * - Approach 1: Use HashMap to count frequencies
 * - Approach 2: Boyer-Moore Voting Algorithm (O(1) space!)
 * - Since majority element appears > n/2 times, it will always "win"
 */

import java.util.*;

public class Easy_169_MajorityElement {

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {

                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

        }

        return candidate;

    }

    // Test cases
    public static void main(String[] args) {
        Easy_169_MajorityElement solution = new Easy_169_MajorityElement();

        // Test case 1
        int[] nums1 = { 3, 2, 3 };
        System.out.println("Test 1: " + solution.majorityElement(nums1)); // Expected: 3

        // Test case 2
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Test 2: " + solution.majorityElement(nums2)); // Expected: 2

        // Test case 3
        int[] nums3 = { 1 };
        System.out.println("Test 3: " + solution.majorityElement(nums3)); // Expected: 1
    }
}
