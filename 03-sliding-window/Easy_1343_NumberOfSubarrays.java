/**
 * LeetCode #1343 - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 * Difficulty: Easy (Medium-ish)
 * Pattern: Sliding Window (Fixed Size)
 *
 * Problem:
 * Given an array of integers arr and two integers k and threshold, return the number of
 * sub-arrays of size k and average greater than or equal to threshold.
 *
 * Example 1:
 * Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
 * Output: 3
 * Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively.
 * All other sub-arrays of size 3 have averages less than 4 (the threshold).
 *
 * Example 2:
 * Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
 * Output: 6
 * Explanation: The first 6 sub-arrays of size 3 have averages greater than 5.
 *
 * Constraints:
 * - 1 <= arr.length <= 10^5
 * - 1 <= arr[i] <= 10^4
 * - 1 <= k <= arr.length
 * - 0 <= threshold <= 10^4
 *
 * Hints to consider:
 * - Fixed size sliding window of size k
 * - Instead of calculating average, compare sum >= threshold * k
 * - Avoids floating point arithmetic
 * - Calculate initial sum of first k elements
 * - Slide window and update sum
 * - Count windows that meet threshold
 */

public class Easy_1343_NumberOfSubarrays {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Easy_1343_NumberOfSubarrays solution = new Easy_1343_NumberOfSubarrays();

        // Test case 1
        int[] arr1 = {2, 2, 2, 2, 5, 5, 5, 8};
        System.out.println("Test 1: " + solution.numOfSubarrays(arr1, 3, 4)); // Expected: 3

        // Test case 2
        int[] arr2 = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        System.out.println("Test 2: " + solution.numOfSubarrays(arr2, 3, 5)); // Expected: 6

        // Test case 3
        int[] arr3 = {1, 1, 1, 1, 1};
        System.out.println("Test 3: " + solution.numOfSubarrays(arr3, 1, 0)); // Expected: 5
    }
}
