/**
 * LeetCode #26 - Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates
 * in-place such that each unique element appears only once. The relative order of
 * the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need
 * to do the following things:
 * - Change the array nums such that the first k elements of nums contain the unique
 *   elements in the order they were present in nums initially.
 * - The remaining elements of nums are not important as well as the size of nums.
 * - Return k.
 *
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of
 * nums being 1 and 2 respectively. It does not matter what you leave beyond the
 * returned k.
 *
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 *
 * Constraints:
 * - 1 <= nums.length <= 3 * 10^4
 * - -100 <= nums[i] <= 100
 * - nums is sorted in non-decreasing order
 *
 * Hints to consider:
 * - Two pointers: slow pointer for position to place next unique element
 * - Fast pointer to scan through array
 * - When nums[fast] != nums[slow], increment slow and copy
 * - In-place modification, O(1) extra space
 */

public class Easy_026_RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
       int slow =0;
       int fast = 1;

       while(fast < nums.length){

        if(nums[slow]== nums[fast]){
            fast++;
        }else{
            nums[slow+1] =nums[fast];
            slow++;
            fast++;
        }

       }
       return slow+1;

    }

    // Test cases
    public static void main(String[] args) {
        Easy_026_RemoveDuplicatesFromSortedArray solution = new Easy_026_RemoveDuplicatesFromSortedArray();

        // Test case 1
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Test 1: k = " + k1); // Expected: 2

        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Test 2: k = " + k2); // Expected: 5

        // Test case 3
        int[] nums3 = {1};
        int k3 = solution.removeDuplicates(nums3);
        System.out.println("Test 3: k = " + k3); // Expected: 1
    }
}
