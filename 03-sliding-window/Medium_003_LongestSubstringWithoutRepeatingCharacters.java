import java.util.*;

/**
 * LeetCode #3 - Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Pattern: Sliding Window (Variable Size)
 *
 * Problem:
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Constraints:
 * - 0 <= s.length <= 5 * 10^4
 * - s consists of English letters, digits, symbols and spaces
 *
 * Hints to consider:
 * - Variable size sliding window
 * - Use HashSet to track characters in current window
 * - Expand window by adding right character
 * - If duplicate found, shrink from left until duplicate removed
 * - Track maximum window size seen
 * - O(n) time, O(min(n, m)) space where m is charset size
 */

public class Medium_003_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Medium_003_LongestSubstringWithoutRepeatingCharacters solution = new Medium_003_LongestSubstringWithoutRepeatingCharacters();

        // Test case 1
        System.out.println("Test 1: " + solution.lengthOfLongestSubstring("abcabcbb")); // Expected: 3

        // Test case 2
        System.out.println("Test 2: " + solution.lengthOfLongestSubstring("bbbbb")); // Expected: 1

        // Test case 3
        System.out.println("Test 3: " + solution.lengthOfLongestSubstring("pwwkew")); // Expected: 3

        // Test case 4
        System.out.println("Test 4: " + solution.lengthOfLongestSubstring("")); // Expected: 0
    }
}
