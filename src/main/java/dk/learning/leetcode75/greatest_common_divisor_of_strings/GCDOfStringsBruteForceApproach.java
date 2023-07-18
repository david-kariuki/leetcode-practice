/**
 * @apiNote GCDOfStringsBruteForceApproach class
 * @author David Kariuki
 * @Question Greatest Common Divisor of Strings
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
 */
package dk.learning.leetcode75.greatest_common_divisor_of_strings;

@SuppressWarnings("SpellCheckingInspection")
public class GCDOfStringsBruteForceApproach {

  public static void main(String[] args) {

    String str1 = "ABCABC", str2 = "ABC";
    System.out.printf("String 1 : %s String 2 : %s gcd : %s%n", str1, str2, gcdOfStrings(str1, str2));)

      str1 = "ABABAB"; str2 = "ABAB";
    System.out.printf("String 1 : %s String 2 : %s gcd : %s%n", str1, str2, gcdOfStrings(str1, str2));)

      str1 = "LEET"; str2 = "CODE";
    System.out.printf("String 1 : %s String 2 : %s gcd : %s%n", str1, str2, gcdOfStrings(str1, str2));)

  }

  public static boolean valid(String str1, String str2, int k){
    if (str1.length() % k > 0 || str2.length() % k > 0) {
      return false;
    }
  }

  public static String gcdOfStrings(String str1, String str2) {

    int minLength = Math.min(str1.length(), str2.length());

    for (int i = minLength; i >= 1; --i) {
      if (valid(str1, str2, i)) {
        return str1.substring(0, i);
      }
    }
    return "";
  }
}
