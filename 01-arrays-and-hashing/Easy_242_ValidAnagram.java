
/**
 * LeetCode #242 - Valid Anagram
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word
 * or phrase, typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
 * - 1 <= s.length, t.length <= 5 * 10^4
 * - s and t consist of lowercase English letters
 *
 * Hints to consider:
 * - If lengths differ, can they be anagrams?
 * - How can you count character frequencies?
 * - Can you use an array instead of HashMap for lowercase letters?
 * - What about sorting the strings?
 */

import java.util.*;

public class Easy_242_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // Your code here

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCountForS = new HashMap<>();
        Map<Character, Integer> charCountForT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charCountForS.put(s.charAt(i), charCountForS.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            charCountForT.put(t.charAt(j), charCountForT.getOrDefault(t.charAt(j), 0) + 1);
        }

        return charCountForS.equals(charCountForT);

    }

    // Test cases
    public static void main(String[] args) {
        Easy_242_ValidAnagram solution = new Easy_242_ValidAnagram();

        // Test case 1
        System.out.println("Test 1: " + solution.isAnagram("anagram", "nagaram")); // Expected: true

        // Test case 2
        System.out.println("Test 2: " + solution.isAnagram("rat", "car")); // Expected: false

        // Test case 3
        System.out.println("Test 3: " + solution.isAnagram("a", "a")); // Expected: true

        // Test case 4
        System.out.println("Test 4: " + solution.isAnagram("ab", "a")); // Expected: false
    }
}
