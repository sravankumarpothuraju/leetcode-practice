/**
 * LeetCode #125 - Valid Palindrome
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase
 * letters and removing all non-alphanumeric characters, it reads the same forward
 * and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 * Constraints:
 * - 1 <= s.length <= 2 * 10^5
 * - s consists only of printable ASCII characters
 *
 * Hints to consider:
 * - Use two pointers: left starting at 0, right starting at end
 * - Skip non-alphanumeric characters
 * - Compare characters case-insensitively
 * - Character.isLetterOrDigit() and Character.toLowerCase() are helpful
 */

public class Easy_125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;

            left++;
            right--;
        }
        return true;
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Easy_125_ValidPalindrome solution = new Easy_125_ValidPalindrome();

        // Test case 1
        System.out.println("Test 1: " + solution.isPalindrome("A man, a plan, a canal: Panama"));
        // Expected: true

        // Test case 2
        System.out.println("Test 2: " + solution.isPalindrome("race a car"));
        // Expected: false

        // Test case 3
        System.out.println("Test 3: " + solution.isPalindrome(" "));
        // Expected: true

        // Test case 4
        System.out.println("Test 4: " + solution.isPalindrome("0P"));
        // Expected: false
    }
}
