/**
 * @apiNote MergeStringsAlternatelyTwoPointerApproach class
 * @author David Kariuki @Question Merge Strings Alternately Two Pointer Approach
 *     <p>You are given two strings word1 and word2. Merge the strings by adding letters in
 *     alternating order, starting with word1. If a string is longer than the other, append the
 *     additional letters onto the end of the merged string.
 * @since 29/06/23
 */
package dk.learning.leetcode75.merge_string_alternatively;

import static java.lang.Math.max;

public class MergeStringsAlternatelyOnePointerApproach {

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqrs";
        System.out.println("Result : " + mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int m = word1.length(), n = word2.length();

        for (int i = 0; i < max(m, n); i++) {
            if (i < m) result.append(word1.charAt(i));
            if (i < n) result.append(word2.charAt(i));
        }

        return result.toString();
    }
}
