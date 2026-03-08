/**
 * LeetCode #11 - Container With Most Water
 * Difficulty: Medium
 * Pattern: Two Pointers
 *
 * Problem:
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the
 * container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area = 49.
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 *
 * Constraints:
 * - n == height.length
 * - 2 <= n <= 10^5
 * - 0 <= height[i] <= 10^4
 *
 * Hints to consider:
 * - Area = width × min(height[left], height[right])
 * - Start with widest possible container (left=0, right=n-1)
 * - Move the pointer with smaller height inward (greedy)
 * - Why? Moving the taller one can only decrease area
 * - Track maximum area seen
 * - O(n) time, O(1) space
 */

public class Medium_011_ContainerWithMostWater {

    public int maxArea(int[] height) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Medium_011_ContainerWithMostWater solution = new Medium_011_ContainerWithMostWater();

        // Test case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Test 1: " + solution.maxArea(height1)); // Expected: 49

        // Test case 2
        int[] height2 = {1, 1};
        System.out.println("Test 2: " + solution.maxArea(height2)); // Expected: 1

        // Test case 3
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Test 3: " + solution.maxArea(height3)); // Expected: 16
    }
}
