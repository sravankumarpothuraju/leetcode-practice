
/**
 * LeetCode #49 - Group Anagrams
 * Difficulty: Medium
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 * Constraints:
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters
 *
 * Hints to consider:
 * - How can you create a unique key for anagrams?
 * - Sorted string as key: "eat" and "tea" both become "aet"
 * - Or use character frequency as key: e1a1t1
 * - Use HashMap where key = signature, value = list of anagrams
 */

import java.util.*;

public class Medium_049_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            if (anagramGroups.containsKey(sortedKey)) {
                anagramGroups.get(sortedKey).add(str);
            } else {
                List<String> group = new ArrayList<>();
                group.add(str);
                anagramGroups.put(sortedKey, group);
            }
        }

        return new ArrayList<>(anagramGroups.values());

    }

    // Test cases
    public static void main(String[] args) {
        Medium_049_GroupAnagrams solution = new Medium_049_GroupAnagrams();

        // Test case 1
        String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println("Test 1: " + solution.groupAnagrams(strs1));
        // Expected: [["bat"],["nat","tan"],["ate","eat","tea"]] (order may vary)

        // Test case 2
        String[] strs2 = { "" };
        System.out.println("Test 2: " + solution.groupAnagrams(strs2));
        // Expected: [[""]]

        // Test case 3
        String[] strs3 = { "a" };
        System.out.println("Test 3: " + solution.groupAnagrams(strs3));
        // Expected: [["a"]]
    }
}
