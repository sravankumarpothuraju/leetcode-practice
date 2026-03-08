/**
 * LeetCode #349 - Intersection of Two Arrays
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4] or [4,9]
 *
 * Constraints:
 * - 1 <= nums1.length, nums2.length <= 1000
 * - 0 <= nums1[i], nums2[i] <= 1000
 *
 * Hints to consider:
 * - Use HashSet to store unique elements from one array
 * - Iterate through second array and check if element exists in set
 * - Add to result set if found
 * - Convert result set to array
 */

import java.util.*;

public class Easy_349_IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Easy_349_IntersectionOfTwoArrays solution = new Easy_349_IntersectionOfTwoArrays();

        // Test case 1
        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums2_1 = {2, 2};
        System.out.println("Test 1: " + Arrays.toString(solution.intersection(nums1_1, nums2_1)));
        // Expected: [2]

        // Test case 2
        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        System.out.println("Test 2: " + Arrays.toString(solution.intersection(nums1_2, nums2_2)));
        // Expected: [9,4] or [4,9]

        // Test case 3
        int[] nums1_3 = {1, 2, 3};
        int[] nums2_3 = {4, 5, 6};
        System.out.println("Test 3: " + Arrays.toString(solution.intersection(nums1_3, nums2_3)));
        // Expected: []
    }
}
