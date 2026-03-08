/**
 * LeetCode #121 - Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Pattern: Sliding Window / Single Pass
 *
 * Problem:
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve
 * any profit, return 0.
 *
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 *
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 * Constraints:
 * - 1 <= prices.length <= 10^5
 * - 0 <= prices[i] <= 10^4
 *
 * Hints to consider:
 * - Track minimum price seen so far (best buy price)
 * - For each price, calculate profit if we sell today
 * - Track maximum profit seen
 * - Single pass O(n) solution
 */

public class Easy_121_BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Easy_121_BestTimeToBuyAndSellStock solution = new Easy_121_BestTimeToBuyAndSellStock();

        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1: " + solution.maxProfit(prices1)); // Expected: 5

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Test 2: " + solution.maxProfit(prices2)); // Expected: 0

        // Test case 3
        int[] prices3 = {1, 2};
        System.out.println("Test 3: " + solution.maxProfit(prices3)); // Expected: 1
    }
}
