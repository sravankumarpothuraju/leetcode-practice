import java.util.*;

/**
 * LeetCode #424 - Longest Repeating Character Replacement
 * Difficulty: Medium
 * Pattern: Sliding Window (Variable Size)
 *
 * Problem:
 * You are given a string s and an integer k. You can choose any character of the string
 * and change it to any other uppercase English character. You can perform this operation
 * at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after
 * performing the above operations.
 *
 * Example 1:
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 *
 * Example 2:
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 *
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s consists of only uppercase English letters
 * - 0 <= k <= s.length
 *
 * Hints to consider:
 * - Variable size sliding window
 * - Track frequency of each character in current window
 * - Key insight: window is valid if (window_size - max_frequency) <= k
 * - If window invalid, shrink from left
 * - Track maximum valid window size
 * - O(n) time, O(26) = O(1) space
 */

public class Medium_424_LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Medium_424_LongestRepeatingCharacterReplacement solution = new Medium_424_LongestRepeatingCharacterReplacement();

        // Test case 1
        System.out.println("Test 1: " + solution.characterReplacement("ABAB", 2)); // Expected: 4

        // Test case 2
        System.out.println("Test 2: " + solution.characterReplacement("AABABBA", 1)); // Expected: 4

        // Test case 3
        System.out.println("Test 3: " + solution.characterReplacement("AAAA", 0)); // Expected: 4
    }
}
