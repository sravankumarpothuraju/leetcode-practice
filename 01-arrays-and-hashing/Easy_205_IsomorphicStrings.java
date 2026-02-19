
/**
 * LeetCode #205 - Isomorphic Strings
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same character,
 * but a character may map to itself.
 *
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Explanation: 'e' -> 'a', 'g' -> 'd'
 *
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Explanation: 'o' maps to both 'a' and 'r'
 *
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 * Explanation: 'p' -> 't', 'a' -> 'i', 'e' -> 'l', 'r' -> 'e'
 *
 * Constraints:
 * - 1 <= s.length <= 5 * 10^4
 * - t.length == s.length
 * - s and t consist of any valid ASCII character
 *
 * Hints to consider:
 * - Need to track mapping in BOTH directions (s->t AND t->s)
 * - Use two HashMaps to ensure one-to-one mapping
 * - Check if s[i] already mapped, it must map to same character
 * - Check if t[i] already mapped from another character
 */

import java.util.*;

public class Easy_205_IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> charStoT = new HashMap<>();
        Map<Character, Character> charTtoS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (charStoT.containsKey(sc) && charStoT.get(sc) != tc)
                return false;
            if (charTtoS.containsKey(tc) && charTtoS.get(tc) != sc)
                return false;

            charStoT.put(sc, tc);
            charTtoS.put(tc, sc);
        }
        return true;
    }

    // Test cases
    public static void main(String[] args) {
        Easy_205_IsomorphicStrings solution = new Easy_205_IsomorphicStrings();

        // Test case 1
        System.out.println("Test 1: " + solution.isIsomorphic("egg", "add")); // Expected: true

        // Test case 2
        System.out.println("Test 2: " + solution.isIsomorphic("foo", "bar")); // Expected: false

        // Test case 3
        System.out.println("Test 3: " + solution.isIsomorphic("paper", "title")); // Expected: true

        // Test case 4
        System.out.println("Test 4: " + solution.isIsomorphic("badc", "baba")); // Expected: false
    }
}
