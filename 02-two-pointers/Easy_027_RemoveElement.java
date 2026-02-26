/**
 * LeetCode #27 - Remove Element
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given an integer array nums and an integer val, remove all occurrences of val
 * in nums in-place. The order of the elements may be changed. Then return the
 * number of elements in nums which are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things:
 * - Change the array nums such that the first k elements of nums contain the
 *   elements which are not equal to val.
 * - The remaining elements of nums are not important as well as the size of nums.
 * - Return k.
 *
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 *
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 *
 * Constraints:
 * - 0 <= nums.length <= 100
 * - 0 <= nums[i] <= 50
 * - 0 <= val <= 100
 *
 * Hints to consider:
 * - Two pointers: one for next position to place non-val element
 * - Scan through array, when element != val, place it at next position
 * - Order doesn't need to be preserved, so you can swap
 * - O(n) time, O(1) space
 */

public class Easy_027_RemoveElement {

    public int removeElement(int[] nums, int val) {

        int slow = 0;
        int fast = 0;

        while(fast < nums.length){

            if(nums[fast]== val){

                fast++;
            }else{
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }

        }
        return slow;
        // Your code here

    }

    // Test cases
    public static void main(String[] args) {
        Easy_027_RemoveElement solution = new Easy_027_RemoveElement();

        // Test case 1
        int[] nums1 = {3, 2, 2, 3};
        int k1 = solution.removeElement(nums1, 3);
        System.out.println("Test 1: k = " + k1); // Expected: 2

        // Test case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int k2 = solution.removeElement(nums2, 2);
        System.out.println("Test 2: k = " + k2); // Expected: 5

        // Test case 3
        int[] nums3 = {1};
        int k3 = solution.removeElement(nums3, 1);
        System.out.println("Test 3: k = " + k3); // Expected: 0
    }
}
