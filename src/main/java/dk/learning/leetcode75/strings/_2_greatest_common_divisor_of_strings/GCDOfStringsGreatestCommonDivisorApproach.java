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
 *     <p>str1 and str2 consist of English uppercase letters.
 * @complexityanalysis Complexity Analysis
 *     <p>Let m,nm, nm,n be the lengths of the two input strings str1 and str2.
 * @timecomplexity O( m + n)
 *     <p>We need to compare the two concatenations of length O(m+n), it takes O(m + n) time.
 *     <p>We calculate the GCD using binary Euclidean algorithm, it takes log(m ⋅ n) time.
 *     <p>To sum up, the overall time complexity is O(m + n).
 * @spacecomplexity O( m + n) We need to compare the two concatenations of length O(m + n).
 * @since 02/07/23
 */
package dk.learning.leetcode75.strings._2_greatest_common_divisor_of_strings;

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

    // Check if they have non-zero GCD string
    if (!(str1 + str2).equals(str2 + str1)) return "";

    // Get the GCD of the two lengths
    int gcdLength = gcd(str1.length(), str2.length());
    return str1.substring(0, gcdLength);
  }

  public static int gcd(int x, int y) {
    if (y == 0) {
      return x;
    } else {
      return gcd(y, x % y);
    }
  }
}
