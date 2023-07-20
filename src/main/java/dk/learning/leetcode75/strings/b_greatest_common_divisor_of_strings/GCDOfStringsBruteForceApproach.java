/**
 * @apiNote GCDOfStringsBruteForceApproach class
 * @author David Kariuki
 * @question Greatest Common Divisor of Strings
 *     <p>For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is
 *     concatenated with itself one or more times).
 *     <p>Given two strings str1 and str2, return the largest string x such that x divides both str1
 *     and str2.
 * @example Input: str1 = "ABCABC", str2 = "ABC" Output: "ABC"
 * @example Input: str1 = "ABABAB", str2 = "ABAB" Output: "AB"
 * @example Input: str1 = "LEET", str2 = "CODE" Output: ""
 * @constraints Constraints
 *     <p>1 <= str1.length, str2.length <= 1000</
 *     <p>str1 and str2 consist of English uppercase letters.
 * @since 02/07/23
 * @see <a
 *     href="https://leetcode.com/problems/greatest-common-divisor-of-strings/editorial/?envType=study-plan-v2&envId=leetcode-75">
 *     Greatest Common Divisor of Strings</a>
 * @complexityanalysis Complexity Analysis
 *     <p>Let m,nm, nm,n be the lengths of the two input strings str1 and str2.
 * @timecomplexity Time complexity: O(min(m,n)⋅(m+n))O
 *     <p>We checked every prefix string base of the shorter string among str1 and str2, and verify
 *     if both strings are made by multiples of base.
 *     <p>There are up to min(m,n) prefix strings to verify and each check involves iterating over
 *     the two input strings to check if the current base is the GCD string, which costs O( m + n).
 *     <p>Therefore, the overall time complexity is O(min(m,n)⋅(m+n)).
 * @spacecomplexity Space complexity: O(min(m,n))
 *     <p>We need to keep a copy of base in each iteration, which takes O(min(m,n)) space.
 */
package dk.learning.leetcode75.strings.b_greatest_common_divisor_of_strings;

import static java.lang.Math.min;

@SuppressWarnings("SpellCheckingInspection")
public class GCDOfStringsBruteForceApproach {

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

    int str1Length = str1.length(), str2Length = str2.length();

    for (int i = min(str1Length, str2Length); i > 0; i--) {
      if (isValid(str1, str2, i)) {
        return str1.substring(0, i);
      }
    }
    return "";
  }

  public static boolean isValid(String str1, String str2, int k) {

    if (str1.length() % k > 0 || str2.length() % k > 0) return false;
    String base = str1.substring(0, k);

    return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
  }
}
