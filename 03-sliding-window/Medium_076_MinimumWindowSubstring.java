import java.util.*;

/**
 * LeetCode #76 - Minimum Window Substring
 * Difficulty: Hard (but commonly asked)
 * Pattern: Sliding Window (Variable Size) with Frequency Map
 *
 * Problem:
 * Given two strings s and t of lengths m and n respectively, return the minimum window
 * substring of s such that every character in t (including duplicates) is included in
 * the window. If there is no such substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 * Example 1:
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 *
 * Example 2:
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 *
 * Example 3:
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 *
 * Constraints:
 * - m == s.length
 * - n == t.length
 * - 1 <= m, n <= 10^5
 * - s and t consist of uppercase and lowercase English letters
 *
 * Hints to consider:
 * - Variable size sliding window
 * - Create frequency map of t (target)
 * - Expand window by moving right, track characters matched
 * - When all characters matched, try to shrink from left
 * - Track minimum window that contains all characters
 * - Use two maps: one for target, one for current window
 * - Or use a counter to track how many characters are fully satisfied
 * - O(m + n) time, O(m + n) space
 */

public class Medium_076_MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Medium_076_MinimumWindowSubstring solution = new Medium_076_MinimumWindowSubstring();

        // Test case 1
        System.out.println("Test 1: " + solution.minWindow("ADOBECODEBANC", "ABC")); // Expected: "BANC"

        // Test case 2
        System.out.println("Test 2: " + solution.minWindow("a", "a")); // Expected: "a"

        // Test case 3
        System.out.println("Test 3: " + solution.minWindow("a", "aa")); // Expected: ""
    }
}
