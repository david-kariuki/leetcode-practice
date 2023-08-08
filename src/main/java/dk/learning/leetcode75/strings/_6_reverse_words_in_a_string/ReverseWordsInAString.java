/**
 * @apiNote class
 * @author David Kariuki
 * @question Reverse Words in a String
 *     <p>Given an input string s, reverse the order of the words.
 *     <p>A word is defined as a sequence of non-space characters. The words in s will be separated
 *     by at least one space.
 *     <p>Return a string of the words in reverse order concatenated by a single space.
 *     <p>Note that s may contain leading or trailing spaces or multiple spaces between two words.
 *     The returned string should only have a single space separating the words. Do not include any
 *     extra spaces.
 * @example Example 1:
 *     <p>Input: s = "the sky is blue" Output: "blue is sky the"
 * @example Example 2:
 *     <p>Input: s = " hello world " Output: "world hello" Explanation: Your reversed string should
 *     not contain leading or trailing spaces.
 * @example Example 3:
 *     <p>Input: s = "a good example" Output: "example good a" Explanation: You need to reduce
 *     multiple spaces between two words to a single space in the reversed string.
 * @constraints Constraints:
 *     <p>1 <= s.length <= 10^4 s contains English letters (upper-case and lower-case), digits, and
 *     spaces ' '. There is at least one word in s.
 * @complexityanalysis Complexity Analysis
 *     <p>
 * @timecomplexity -
 *     <p>
 * @spacecomplexity -
 *     <p>
 * @since dd/08/23
 * @see <a href="https://leetcode.com/problems/>--</a>
 */
package dk.learning.leetcode75.strings._6_reverse_words_in_a_string;

public class ReverseWordsInAString {

  public static void main(String[] args) {

    // Example 1:
    String string = "the sky is blue";
    System.out.printf(
        "\n\nInitial : %s\nReversed : %s",
        string, reverseWords(string)); // Output: "blue is sky the"

    // Example 2:
    string = "  hello world  ";
    System.out.printf(
        "\n\nInitial : %s\nReversed : %s", string, reverseWords(string)); // Output: "world hello"
    // Explanation: Your reversed string should not contain leading or trailing spaces.

    // Example 3:
    string = "a good   example";
    System.out.printf(
        "\n\nInitial : %s\nReversed : %s",
        string, reverseWords(string)); // Output: "example good a"
    // Explanation: You need to reduce multiple spaces between two words to a single space in the
    // reversed string.

  }

  public static String reverseWords(String string) {

    StringBuilder result = new StringBuilder();
    String[] stringArr = string.trim().split("\\s+");

    for (int i = stringArr.length - 1; i >= 0; i--) {
      result.append(stringArr[i]);
      if (i > 0) result.append(" ");
    }

    return result.toString();
  }
}
