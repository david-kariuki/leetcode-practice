/**
 * @apiNote MergeStringsAlternatelyTwoPointerApproach class
 * @author David Kariuki
 * @version 1.0.0
 * @Question Merge Strings Alternately Two Pointer Approach
 * <p>You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end
 * of the merged string.</p>
 * @since 29/06/23
 */
package dk.learning.leetcode75;

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
