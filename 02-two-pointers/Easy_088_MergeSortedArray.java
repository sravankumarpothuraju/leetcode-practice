/**
 * LeetCode #88 - Merge Sorted Array
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2
 * respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged, and the
 * last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 *
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 *
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 *
 * Constraints:
 * - nums1.length == m + n
 * - nums2.length == n
 * - 0 <= m, n <= 200
 * - 1 <= m + n <= 200
 * - -10^9 <= nums1[i], nums2[j] <= 10^9
 *
 * Follow-up: Can you come up with an algorithm that runs in O(m + n) time?
 *
 * Hints to consider:
 * - Work backwards! Start from the end of nums1
 * - Three pointers: p1 at end of nums1 data (m-1), p2 at end of nums2 (n-1),
 *   p at end of nums1 array (m+n-1)
 * - Compare nums1[p1] and nums2[p2], place larger at nums1[p]
 * - Avoids overwriting unprocessed elements
 */

import java.util.*;

public class Easy_088_MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {

            if (nums2[p2] > nums1[p1]) {

                nums1[p3] = nums2[p2];
                p3--;
                p2--;
            } else {
                nums1[p3] = nums1[p1];
                p3--;
                p1--;

            }
        }

        while (p2>=0) {

            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }

    }

    // Test cases
    public static void main(String[] args) {
        Easy_088_MergeSortedArray solution = new Easy_088_MergeSortedArray();

        // Test case 1
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int[] nums2_1 = {2, 5, 6};
        solution.merge(nums1_1, 3, nums2_1, 3);
        System.out.println("Test 1: " + Arrays.toString(nums1_1)); // Expected: [1,2,2,3,5,6]

        // Test case 2
        int[] nums1_2 = {1};
        int[] nums2_2 = {};
        solution.merge(nums1_2, 1, nums2_2, 0);
        System.out.println("Test 2: " + Arrays.toString(nums1_2)); // Expected: [1]

        // Test case 3
        int[] nums1_3 = {0};
        int[] nums2_3 = {1};
        solution.merge(nums1_3, 0, nums2_3, 1);
        System.out.println("Test 3: " + Arrays.toString(nums1_3)); // Expected: [1]
    }
}
