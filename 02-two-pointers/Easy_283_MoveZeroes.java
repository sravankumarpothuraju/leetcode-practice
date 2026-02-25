/**
 * LeetCode #283 - Move Zeroes
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -2^31 <= nums[i] <= 2^31 - 1
 *
 * Follow-up: Could you minimize the total number of operations done?
 *
 * Hints to consider:
 * - Two pointers: one for position to place next non-zero
 * - One pointer scans through array
 * - When you find non-zero, swap with left pointer position
 * - O(n) time, O(1) space
 */

import java.util.*;

public class Easy_283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {

            if (nums[fast] != 0) {

                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
                fast++;

            } else {
                fast++;
            }
        }

    }

    // Test cases
    public static void main(String[] args) {
        Easy_283_MoveZeroes solution = new Easy_283_MoveZeroes();

        // Test case 1
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println("Test 1: " + Arrays.toString(nums1)); // Expected: [1, 3, 12, 0, 0]

        // Test case 2
        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println("Test 2: " + Arrays.toString(nums2)); // Expected: [0]

        // Test case 3
        int[] nums3 = {1, 2, 3};
        solution.moveZeroes(nums3);
        System.out.println("Test 3: " + Arrays.toString(nums3)); // Expected: [1, 2, 3]
    }
}
