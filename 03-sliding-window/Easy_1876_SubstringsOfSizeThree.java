import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #1876 - Substrings of Size Three with Distinct Characters
 * Difficulty: Easy
 * Pattern: Sliding Window (Fixed Size)
 *
 * Problem:
 * A string is good if there are no repeated characters.
 *
 * Given a string s, return the number of good substrings of length three in s.
 *
 * Note that if there are multiple occurrences of the same substring, every occurrence
 * should be counted.
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 * Example 1:
 * Input: s = "xyzzaz"
 * Output: 1
 * Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
 * The only good substring of length 3 is "xyz".
 *
 * Example 2:
 * Input: s = "aababcabc"
 * Output: 4
 * Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
 * The good substrings are "abc", "bca", "cab", and "abc".
 *
 * Constraints:
 * - 1 <= s.length <= 100
 * - s consists of lowercase English letters
 *
 * Hints to consider:
 * - Fixed sliding window of size 3
 * - For each window, check if all 3 characters are distinct
 * - Can use Set or simple comparison (only 3 chars)
 * - Count valid windows
 * - O(n) time, O(1) space
 */


public class Easy_1876_SubstringsOfSizeThree {

    public int countGoodSubstrings(String s) {

        int count = 0;

        for (int i = 2; i < s.length(); i++) {

            char a = s.charAt(i - 2);
            char b = s.charAt(i - 1);
            char c = s.charAt(i);

            if (a != b && b != c && c != a) {
                count++;
            }

        }

        return count;

    }

    // Test cases
    public static void main(String[] args) {
        Easy_1876_SubstringsOfSizeThree solution = new Easy_1876_SubstringsOfSizeThree();

        // Test case 1
        System.out.println("Test 1: " + solution.countGoodSubstrings("xyzzaz")); // Expected: 1

        // Test case 2
        System.out.println("Test 2: " + solution.countGoodSubstrings("aababcabc")); // Expected: 4

        // Test case 3
        System.out.println("Test 3: " + solution.countGoodSubstrings("abc")); // Expected: 1
    }
}
