/**
 * @apiNote ReverseVowelsOfAString class
 * @author David Kariuki
 * @question Reverse Vowels of a String
 *     <p>Given a string s, reverse only all the vowels in the string and return it.
 *     <p>The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper
 *     cases, more than once.
 * @example Example 1:
 *     <p>Input: s = "hello" Output: "holle"
 * @example Example 2:
 *     <p>Input: s = "leetcode" Output: "leotcede"
 * @constraints Constraints:
 *     <p>1 <= s.length <= 3 * 105 s consist of printable ASCII characters.
 * @complexityanalysis Complexity Analysis
 *     <p>
 * @timecomplexity -
 *     <p>
 * @spacecomplexity -
 *     <p>
 * @since dd/07/23
 * @see <a href="">Title</a>
 */
package dk.learning.leetcode75.strings.reverse_string_vowels;

import java.util.Arrays;

public class ReverseVowelsOfAString {

  public static void main(String[] args) {

    // Example 1:
    String string = "hello"; // Output: "holle"
    System.out.printf("\n\nInput : %s, Reversed output : %s", string, reverseVowels(string));

    // Example 2:
    string = "leetcode"; // Output: "leotcede"
    System.out.printf("\n\nInput : %s, Reversed output : %s", string, reverseVowels(string));
  }

  public static String reverseVowels(String string) {

    char[] stringArray = string.toCharArray();
    Character previousVowel = null, nextVowel = null;

    for (int i = 0; i < stringArray.length; i++) {
      if (!isVowel(stringArray[i])) continue;

      previousVowel = stringArray[i];

      for (int j = i + 1; j < stringArray.length; j++) {
        if (!isVowel(stringArray[j])) continue;

        nextVowel = stringArray[j];

        stringArray[i] = nextVowel;
        stringArray[j] = previousVowel;
      }
    }
    return Arrays.toString(stringArray);
  }

  public static boolean isVowel(Character character) {
    character = Character.toLowerCase(character);
    return (character.equals('a')
        || character.equals('e')
        || character.equals('i')
        || character.equals('o')
        || character.equals('u'));
  }
}
