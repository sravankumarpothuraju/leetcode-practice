/**
 * LeetCode #347 - Top K Frequent Elements
 * Difficulty: Medium
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - k is in the range [1, the number of unique elements in the array]
 * - It is guaranteed that the answer is unique
 *
 * Follow-up: Your algorithm's time complexity must be better than O(n log n)
 *
 * Hints to consider:
 * - First step: count frequencies using HashMap
 * - Approach 1: Use a heap/priority queue - O(n log k)
 * - Approach 2: Bucket sort by frequency - O(n)
 * - Max frequency possible is n (all elements same)
 */

import java.util.*;

public class Medium_347_TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Medium_347_TopKFrequentElements solution = new Medium_347_TopKFrequentElements();

        // Test case 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int[] result1 = solution.topKFrequent(nums1, 2);
        System.out.println("Test 1: " + Arrays.toString(result1)); // Expected: [1,2]

        // Test case 2
        int[] nums2 = {1};
        int[] result2 = solution.topKFrequent(nums2, 1);
        System.out.println("Test 2: " + Arrays.toString(result2)); // Expected: [1]

        // Test case 3
        int[] nums3 = {4, 4, 4, 1, 1, 2};
        int[] result3 = solution.topKFrequent(nums3, 2);
        System.out.println("Test 3: " + Arrays.toString(result3)); // Expected: [4,1]
    }
}
