/**
 * LeetCode #219 - Contains Duplicate II
 * Difficulty: Easy
 * Pattern: Sliding Window with HashSet
 *
 * Problem:
 * Given an integer array nums and an integer k, return true if there are two distinct
 * indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 * - 0 <= k <= 10^5
 *
 * Hints to consider:
 * - Sliding window of size k
 * - Use HashSet to track elements in current window
 * - If duplicate found in window, return true
 * - Slide window: remove leftmost, add new element
 * - O(n) time, O(k) space
 */

import java.util.*;

public class Easy_219_ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {

                hashSet.remove(nums[i - k - 1]);
            }

            if (hashSet.contains(nums[i])) {

                return true;
            }
            hashSet.add(nums[i]);

        }
        return false;

    }

    // Test cases
    public static void main(String[] args) {
        Easy_219_ContainsDuplicateII solution = new Easy_219_ContainsDuplicateII();

        // Test case 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + solution.containsNearbyDuplicate(nums1, 3)); // Expected: true

        // Test case 2
        int[] nums2 = {1, 0, 1, 1};
        System.out.println("Test 2: " + solution.containsNearbyDuplicate(nums2, 1)); // Expected: true

        // Test case 3
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println("Test 3: " + solution.containsNearbyDuplicate(nums3, 2)); // Expected: false
    }
}
