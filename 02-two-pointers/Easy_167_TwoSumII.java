/**
 * LeetCode #167 - Two Sum II - Input Array Is Sorted
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given a 1-indexed array of integers numbers that is already sorted in
 * non-decreasing order, find two numbers such that they add up to a specific
 * target number. Let these two numbers be numbers[index1] and numbers[index2]
 * where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, added by one as
 * an integer array [index1, index2] of length 2.
 *
 * You may not use the same element twice.
 * Your solution must use only constant extra space.
 *
 * Example 1:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2.
 * We return [1, 2].
 *
 * Example 2:
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 *
 * Example 3:
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 *
 * Constraints:
 * - 2 <= numbers.length <= 3 * 10^4
 * - -1000 <= numbers[i] <= 1000
 * - numbers is sorted in non-decreasing order
 * - -1000 <= target <= 1000
 * - The tests are generated such that there is exactly one solution
 *
 * Hints to consider:
 * - Array is SORTED - leverage this!
 * - Two pointers: left at start, right at end
 * - If sum < target, move left pointer right
 * - If sum > target, move right pointer left
 * - O(n) time, O(1) space
 */

import java.util.*;

public class Easy_167_TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left< right){

            if(numbers[left] + numbers[right] == target){
                return new int[]{left+1, right+1};

            }
            else if(numbers[left]+ numbers[right] > target){
                right--;
            }else{
                left++;
            }
        }
      return new int[]{-1,-1};

    }

    // Test cases
    public static void main(String[] args) {
        Easy_167_TwoSumII solution = new Easy_167_TwoSumII();

        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        System.out.println("Test 1: " + Arrays.toString(solution.twoSum(nums1, 9)));
        // Expected: [1, 2]

        // Test case 2
        int[] nums2 = {2, 3, 4};
        System.out.println("Test 2: " + Arrays.toString(solution.twoSum(nums2, 6)));
        // Expected: [1, 3]

        // Test case 3
        int[] nums3 = {-1, 0};
        System.out.println("Test 3: " + Arrays.toString(solution.twoSum(nums3, -1)));
        // Expected: [1, 2]
    }
}
