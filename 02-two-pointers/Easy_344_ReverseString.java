/**
 * LeetCode #344 - Reverse String
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Write a function that reverses a string. The input string is given as an
 * array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s[i] is a printable ASCII character
 *
 * Hints to consider:
 * - Classic two pointers: left at start, right at end
 * - Swap s[left] and s[right]
 * - Move pointers toward center
 * - Stop when left >= right
 */

import java.util.*;

public class Easy_344_ReverseString {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];

            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;

        }

    }

    // Test cases
    public static void main(String[] args) {
        Easy_344_ReverseString solution = new Easy_344_ReverseString();

        // Test case 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s1);
        System.out.println("Test 1: " + Arrays.toString(s1)); // Expected: [o, l, l, e, h]

        // Test case 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s2);
        System.out.println("Test 2: " + Arrays.toString(s2)); // Expected: [h, a, n, n, a, H]

        // Test case 3
        char[] s3 = {'A'};
        solution.reverseString(s3);
        System.out.println("Test 3: " + Arrays.toString(s3)); // Expected: [A]
    }
}
