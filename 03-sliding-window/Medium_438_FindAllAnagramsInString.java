import java.util.*;

/**
 * LeetCode #438 - Find All Anagrams in a String
 * Difficulty: Medium
 * Pattern: Sliding Window (Fixed Size) with Frequency Map
 *
 * Problem:
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or
 * phrase, typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 * Example 2:
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 *
 * Constraints:
 * - 1 <= s.length, p.length <= 3 * 10^4
 * - s and p consist of lowercase English letters
 *
 * Hints to consider:
 * - Fixed size sliding window of size p.length
 * - Similar to Permutation in String (#567)
 * - Create frequency map/array of p
 * - Slide window through s and compare frequencies
 * - When match found, add starting index to result
 * - Use array of size 26 for efficiency
 * - O(n) time where n is s.length, O(1) space (26 letters)
 */

public class Medium_438_FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Medium_438_FindAllAnagramsInString solution = new Medium_438_FindAllAnagramsInString();

        // Test case 1
        System.out.println("Test 1: " + solution.findAnagrams("cbaebabacd", "abc")); // Expected: [0, 6]

        // Test case 2
        System.out.println("Test 2: " + solution.findAnagrams("abab", "ab")); // Expected: [0, 1, 2]

        // Test case 3
        System.out.println("Test 3: " + solution.findAnagrams("baa", "aa")); // Expected: [1]
    }
}
