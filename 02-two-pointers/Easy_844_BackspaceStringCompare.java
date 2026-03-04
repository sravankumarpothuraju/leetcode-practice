/**
 * LeetCode #844 - Backspace String Compare
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given two strings s and t, return true if they are equal when both are typed
 * into empty text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1:
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 *
 * Example 2:
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 *
 * Example 3:
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 *
 * Constraints:
 * - 1 <= s.length, t.length <= 200
 * - s and t only contain lowercase letters and '#' characters
 *
 * Follow-up: Can you solve it in O(n) time and O(1) space?
 *
 * Hints to consider:
 * - Approach 1: Build actual strings using stack (O(n) space)
 * - Approach 2: Two pointers from the END backwards (O(1) space!)
 * - Process backspaces by counting '#' as you go backward
 * - Compare characters only when no pending backspaces
 * - Skip characters if backspace count > 0
 */

public class Easy_844_BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
            return build(s).equals(build(t));
    }

    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    

    }

    // Test cases
    public static void main(String[] args) {
        Easy_844_BackspaceStringCompare solution = new Easy_844_BackspaceStringCompare();

        // Test case 1
        System.out.println("Test 1: " + solution.backspaceCompare("ab#c", "ad#c"));
        // Expected: true

        // Test case 2
        System.out.println("Test 2: " + solution.backspaceCompare("ab##", "c#d#"));
        // Expected: true

        // Test case 3
        System.out.println("Test 3: " + solution.backspaceCompare("a#c", "b"));
        // Expected: false

        // Test case 4
        System.out.println("Test 4: " + solution.backspaceCompare("a##c", "#a#c"));
        // Expected: true
    }
}
