
/**
 * LeetCode #128 - Longest Consecutive Sequence
 * Difficulty: Medium
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an unsorted array of integers nums, return the length of the
 * longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive sequence is [1, 2, 3, 4]. Its length is 4.
 *
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * Explanation: The longest consecutive sequence is [0,1,2,3,4,5,6,7,8]. Its length is 9.
 *
 * Constraints:
 * - 0 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 *
 * Hints to consider:
 * - Sorting would give O(n log n) - too slow!
 * - Use HashSet for O(1) lookups
 * - How to identify the START of a sequence?
 * - A number n is the start if (n-1) is NOT in the set
 * - Once you find a start, count consecutive numbers
 */

import java.util.*;

public class Medium_128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count the length of the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;

    }

    // Test cases
    public static void main(String[] args) {
        Medium_128_LongestConsecutiveSequence solution = new Medium_128_LongestConsecutiveSequence();

        // Test case 1
        int[] nums1 = { 100, 4, 200, 1, 3, 2 };
        System.out.println("Test 1: " + solution.longestConsecutive(nums1)); // Expected: 4

        // Test case 2
        int[] nums2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println("Test 2: " + solution.longestConsecutive(nums2)); // Expected: 9

        // Test case 3 - Empty array
        int[] nums3 = {};
        System.out.println("Test 3: " + solution.longestConsecutive(nums3)); // Expected: 0

        // Test case 4 - Single element
        int[] nums4 = { 1 };
        System.out.println("Test 4: " + solution.longestConsecutive(nums4)); // Expected: 1
    }
}
