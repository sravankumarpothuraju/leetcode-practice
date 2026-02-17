
/**
 * LeetCode #202 - Happy Number
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 * - Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly
 *   in a cycle which does not include 1.
 * - Those numbers for which this process ends in 1 are happy.
 *
 * Return true if n is a happy number, and false if not.
 *
 * Example 1:
 * Input: n = 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 * Example 2:
 * Input: n =
 * Output: false
 *
 * Constraints:
 * - 1 <= n <= 2^31 - 1
 *
 * Hints to consider:
 * - Use HashSet to detect cycles
 * - If we've seen a number before, we're in a loop
 * - Helper function to calculate sum of squares of digits
 * - Alternative: Floyd's cycle detection (fast/slow pointers)
 */

import java.util.*;

public class Easy_202_HappyNumber {

    public boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();

        while (n != 1) {

            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);
            n = getSumOfSquares(n);
        }

        return true;

    }

    private int getSumOfSquares(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;

        }

        return sum;
    }

    // Test cases
    public static void main(String[] args) {
        Easy_202_HappyNumber solution = new Easy_202_HappyNumber();

        // Test case 1
        System.out.println("Test 1: " + solution.isHappy(19)); // Expected: true

        // Test case 2
        System.out.println("Test 2: " + solution.isHappy(2)); // Expected: false

        // Test case 3
        System.out.println("Test 3: " + solution.isHappy(1)); // Expected: true

        // Test case 4
        System.out.println("Test 4: " + solution.isHappy(7)); // Expected: true
    }
}
