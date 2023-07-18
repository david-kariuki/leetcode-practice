/**
 * @apiNote MergeStringsAlternatively class
 * @author David Kariuki @Question Merge Strings Alternately
 *     <p>You are given two strings word1 and word2. Merge the strings by adding letters in
 *     alternating order, starting with word1.
 *     <p>If a string is longer than the other, append the additional letters onto the end of the
 *     merged string. Return the merged string.
 * @example Example 1:
 *     <p>Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged string will
 *     be merged as so: word1: a b c word2: p q r merged: a p b q c r
 * @example Example 2:
 *     <p>Input: word1 = "ab", word2 = "pqrs" Output: "apbqrs" Explanation: Notice that as word2 is
 *     longer, "rs" is appended to the end. word1: a b word2: p q r s merged: a p b q r s
 * @example Example 3:
 *     <p>Input: word1 = "abcd", word2 = "pq" Output: "apbqcd" Explanation: Notice that as word1 is
 *     longer, "cd" is appended to the end. word1: a b c d word2: p q merged: a p b q c d
 * @constraints: 1 <= word1.length, word2.length <= 100 word1 and word2 consist of lowercase English
 *     letters.
 * @since 17/07/23
 */
package dk.learning.leetcode75.strings;


public class MergeStringsAlternatively {
  public static void main(String[] args) {

    // Example 1:
    String word1 = "abc";
    String word2 = "pqr";
    System.out.printf(
        "\n\nResult of Word 1 : %s merged alternatively with word 2 : %s is %s",
        word1, word2, mergeAlternately(word1, word2));

    // Example 2:
    word1 = "ab";
    word2 = "pqrs";
    System.out.printf(
        "\n\nResult of Word 1 : %s merged alternatively with word 2 : %s is %s",
        word1, word2, mergeAlternately(word1, word2));

    // Example 3:
    word1 = "abcd";
    word2 = "pq";
    System.out.printf(
        "\n\nResult of Word 1 : %s merged alternatively with word 2 : %s is %s",
        word1, word2, mergeAlternately(word1, word2));
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
