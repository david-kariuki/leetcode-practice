/**
 * @apiNote MergeStringsAlternatelyTwoPointerApproach class
 * @author David Kariuki
 * @question Merge Strings Alternately Two Pointer Approach
 *     <p>You are given two strings word1 and word2. Merge the strings by adding letters in
 *     alternating order, starting with word1. If a string is longer than the other, append the
 *     additional letters onto the end of the merged string.
 * @example Example 1:
 *     <p>Input: word1 = "abc", word2 = "pqr"
 *     <p>Output: "apbqcr"
 *     <p>Explanation: The merged string will be merged as so:
 *     <p>word1: a b c
 *     <p>word2: p q r
 *     <p>merged: a p b q c r
 * @example Example 2:
 *     <p>Input: word1 = "ab", word2 = "pqrs"
 *     <p>Output: "apbqrs"
 *     <p>Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 *     <p>word1: a b
 *     <p>word2: p q r s
 *     <p>merged: a p b q r s
 * @example Example 3:
 *     <p>Input: word1 = "abcd", word2 = "pq"
 *     <p>Output: "apbqcd"
 *     <p>Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 *     <p>word1: a b c d
 *     <p>word2: p q
 *     <p>merged: a p b q c d
 * @constraints Constraints: *
 *     <p>1 <= word1.length, word2.length <= 100
 *     <p>word1 and word2 consist of lowercase English letters.
 * @since 29/06/23
 * @see <a
 *     href="https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75">
 *     Merge Strings Alternately</a>
 * @complexityanalysis Complexity Analysis
 *     <p>>Here, mmm is the length of word1 and nnn is the length of word2.
 * @timecomplexity Time complexity O(m+n)
 *     <p>We iterate over word1 and word2 once and push their letters into result. It would take O(m+n) time.
 * @spacecomplexity Space complexity O(1)
 *     <p>Without considering the space consumed by the input strings (word1 and word2) and the
 *     output string (result), we do not use more than constant space.
 */
package dk.learning.leetcode75.strings.a_merge_string_alternatively;

public class MergeStringsAlternatelyTwoPointerApproach {

  public static void main(String[] args) {
    String word1 = "abc", word2 = "pqrs";
    System.out.println("Result : " + mergeAlternately(word1, word2));
  }

  public static String mergeAlternately(String word1, String word2) {

    StringBuilder result = new StringBuilder();
    int i = 0, j = 0;
    int word1Length = word1.length(), word2Length = word2.length();

    while (i < word1Length || j < word2Length) {
      if (i < word1Length) result.append(word1.charAt(i++));
      if (j < word2Length) result.append(word2.charAt(j++));
    }

    return result.toString();
  }
}
