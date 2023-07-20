/**
 * @apiNote GCDOfStringsBruteForceApproach class
 * @author David Kariuki @Question Greatest Common Divisor of Strings
 *     <p>For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is
 *     concatenated with itself one or more times).
 *     <p>Given two strings str1 and str2, return the largest string x such that x divides both str1
 *     and str2.
 * @example Input: str1 = "ABCABC", str2 = "ABC" Output: "ABC"
 * @example Input: str1 = "ABABAB", str2 = "ABAB" Output: "AB"
 * @example Input: str1 = "LEET", str2 = "CODE" Output: ""
 * @constraints Constraints
 *     <p>1 <= str1.length, str2.length <= 1000</
 *     <p>str1 and str2 consist of English uppercase letters. @ComplexityAnalysis Let m,nm, nm,n be
 *     the lengths of the two input strings str1 and str2. @TimeComplexity
 *     <p>O(min(m,n)⋅(m+n))O(\min(m, n) \cdot (m + n))O(min(m,n)⋅(m+n)) We checked every prefix
 *     string base of the shorter string among str1 and str2, and verify if both strings are made by
 *     multiples of base.
 *     <p>There are up to min(m,n)\min(m, n)min(m,n) prefix strings to verify and each check
 *     involves iterating over the two input strings to check if the current base is the GCD string,
 *     which costs O(m+n)O(m + n)O(m+n).
 *     <p>Therefore, the overall time complexity is O(min(m,n)⋅(m+n))O(\min(m, n) \cdot (m +
 *     n))O(min(m,n)⋅(m+n)). @SpaceComplexity O(min(m,n))O(\min(m, n))O(min(m,n)) We need to keep a
 *     copy of base in each iteration, which takes O(min(m,n))O(\min(m, n))O(min(m,n)) space.
 * @since 02/07/23
 */
package dk.learning.leetcode75.strings.greatest_common_divisor_of_strings;

@SuppressWarnings("SpellCheckingInspection")
public class GCDOfStringsGreatestCommonDivisorApproach {

  public static void main(String[] args) {

    String str1 = "ABCABC", str2 = "ABC";
    System.out.printf(
        "String 1 : %s String 2 : %s gcd : %s%n", str1, str2, gcdOfStrings(str1, str2));

    str1 = "ABABAB";
    str2 = "ABAB";
    System.out.printf(
        "String 1 : %s String 2 : %s gcd : %s%n", str1, str2, gcdOfStrings(str1, str2));

    str1 = "LEET";
    str2 = "CODE";
    System.out.printf(
        "String 1 : %s String 2 : %s gcd : %s%n", str1, str2, gcdOfStrings(str1, str2));
  }

  public static String gcdOfStrings(String str1, String str2) {

    return "";
  }
}
