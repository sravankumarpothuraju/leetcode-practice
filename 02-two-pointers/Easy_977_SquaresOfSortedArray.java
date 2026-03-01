/**
 * LeetCode #977 - Squares of a Sorted Array
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums is sorted in non-decreasing order
 *
 * Follow-up: Squaring each element and sorting the new array is very trivial,
 * could you find an O(n) solution using a different approach?
 *
 * Hints to consider:
 * - The largest squares are at the ends (negative or positive extremes)
 * - Two pointers: left at start, right at end
 * - Compare |nums[left]| vs |nums[right]|
 * - Fill result array from the end backwards
 * - O(n) time without sorting!
 */

import java.util.*;

public class Easy_977_SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int pos = nums.length - 1;

        while (left <= right) {

            if (nums[left] * nums[left] < nums[right] * nums[right]) {

                result[pos] = nums[right] * nums[right];
                pos--;
                right--;

            } else {

                result[pos] = nums[left] * nums[left];
                pos--;
                left++;
            }
        }
        return result;

    }

    // Test cases
    public static void main(String[] args) {
        Easy_977_SquaresOfSortedArray solution = new Easy_977_SquaresOfSortedArray();

        // Test case 1
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println("Test 1: " + Arrays.toString(solution.sortedSquares(nums1)));
        // Expected: [0, 1, 9, 16, 100]

        // Test case 2
        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println("Test 2: " + Arrays.toString(solution.sortedSquares(nums2)));
        // Expected: [4, 9, 9, 49, 121]

        // Test case 3
        int[] nums3 = {-5, -3, -2, -1};
        System.out.println("Test 3: " + Arrays.toString(solution.sortedSquares(nums3)));
        // Expected: [1, 4, 9, 25]
    }
}
