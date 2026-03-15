import java.util.*;

/**
 * LeetCode #567 - Permutation in String
 * Difficulty: Medium
 * Pattern: Sliding Window (Fixed Size) with Frequency Map
 *
 * Problem:
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1,
 * or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 *
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 *
 * Constraints:
 * - 1 <= s1.length, s2.length <= 10^4
 * - s1 and s2 consist of lowercase English letters
 *
 * Hints to consider:
 * - Fixed size sliding window of size s1.length
 * - Create frequency map of s1
 * - Slide window through s2 and compare frequency maps
 * - Can optimize: track matching character counts instead of comparing entire maps
 * - Alternative: use array of size 26 for lowercase letters
 * - O(n) time where n is s2.length, O(1) space (26 letters)
 */

public class Medium_567_PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Medium_567_PermutationInString solution = new Medium_567_PermutationInString();

        // Test case 1
        System.out.println("Test 1: " + solution.checkInclusion("ab", "eidbaooo")); // Expected: true

        // Test case 2
        System.out.println("Test 2: " + solution.checkInclusion("ab", "eidboaoo")); // Expected: false

        // Test case 3
        System.out.println("Test 3: " + solution.checkInclusion("adc", "dcda")); // Expected: true
    }
}
