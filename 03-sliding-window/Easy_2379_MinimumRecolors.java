/**
 * LeetCode #2379 - Minimum Recolors to Get K Consecutive Black Blocks
 * Difficulty: Easy
 * Pattern: Sliding Window (Fixed Size)
 *
 * Problem:
 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B',
 * representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black.
 *
 * You are also given an integer k, which is the desired number of consecutive black blocks.
 *
 * In one operation, you can recolor a white block such that it becomes a black block.
 *
 * Return the minimum number of operations needed such that there is at least one occurrence of
 * k consecutive black blocks.
 *
 * Example 1:
 * Input: blocks = "WBBWWBBWBW", k = 7
 * Output: 3
 * Explanation:
 * One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
 * so that blocks = "BBBBBBBWBW".
 * It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
 * Therefore, we return 3.
 *
 * Example 2:
 * Input: blocks = "WBWBBBW", k = 2
 * Output: 0
 * Explanation:
 * No changes need to be made, since 2 consecutive black blocks already exist.
 * Therefore, we return 0.
 *
 * Constraints:
 * - n == blocks.length
 * - 1 <= n <= 100
 * - blocks[i] is either 'W' or 'B'
 * - 1 <= k <= n
 *
 * Hints to consider:
 * - Fixed sliding window of size k
 * - For each window, count number of 'W' (white blocks)
 * - The count of 'W' is the number of operations needed
 * - Find window with minimum 'W' count
 * - Slide window: remove left char, add right char
 */

public class Easy_2379_MinimumRecolors {

    public int minimumRecolors(String blocks, int k) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Easy_2379_MinimumRecolors solution = new Easy_2379_MinimumRecolors();

        // Test case 1
        System.out.println("Test 1: " + solution.minimumRecolors("WBBWWBBWBW", 7)); // Expected: 3

        // Test case 2
        System.out.println("Test 2: " + solution.minimumRecolors("WBWBBBW", 2)); // Expected: 0

        // Test case 3
        System.out.println("Test 3: " + solution.minimumRecolors("BWWWBB", 6)); // Expected: 3
    }
}
