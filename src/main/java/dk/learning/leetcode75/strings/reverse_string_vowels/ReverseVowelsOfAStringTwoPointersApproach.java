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
 *     <p>Here, N is the length of the string s.
 * @timecomplexity - Time complexity: O(N)
 *     <p>It might be tempting to say that there are two nested loops and hence the complexity would
 *     be O(N^2).
 *     <p>However, if we observe closely the pointers start and end will only traverse the index
 *     once. Each element of the string s will be iterated only once either by the left or right
 *     pointer and not both.
 *     <p>We swap characters when both pointers point to vowels which are O(1) operation. Hence the
 *     total time complexity will be O(N).
 *     <p>Note that in Java we need to convert the string to a char array as strings are immutable
 *     and hence it would take O(N) time.
 * @spacecomplexity - Space complexity: O(N)
 *     <p>In C++ we only need an extra temporary variable to perform the swap and hence the space
 *     complexity is O(1). However, in Java, we need to convert the string to a char array that
 *     would take O(N) space, and therefore the space complexity for Java would be O(N).
 *     <p>
 * @since 28/07/23
 * @see <a
 *     href="https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75">
 *     Reverse Vowels of a String </a>
 */
package dk.learning.leetcode75.strings.reverse_string_vowels;

@SuppressWarnings("BooleanMethodIsAlwaysInverted")
public class ReverseVowelsOfAStringTwoPointersApproach {

  public static void main(String[] args) {

    // Example 1:
    String string = "hello"; // Output: "holle"
    System.out.printf("\n\nInput : %s, Reversed output : %s", string, reverseVowels(string));

    // Example 2:
    string = "leetcode"; // Output: "leotcede"
    System.out.printf("\n\nInput : %s, Reversed output : %s", string, reverseVowels(string));
  }

  public static String reverseVowels(String string) {

    int start = 0, end = string.length() - 1;
    char[] charArray = string.toCharArray();

    while (start < end) {
      while (start < string.length() && !isVowel(charArray[start])) start++;
      while (end >= 0 && !isVowel(charArray[end])) end--;
      if (start < end) swap(charArray, start++, end--);
    }

    return new String(charArray);
  }

  static void swap(char[] chars, int x, int y) {
    char temp = chars[x];
    chars[x] = chars[y];
    chars[y] = temp;
  }

  public static boolean isVowel(Character character) {
    character = Character.toLowerCase(character);
    return (character.equals('a')
        || character.equals('e')
        || character.equals('i')
        || character.equals('o')
        || character.equals('u')
        || character.equals('A')
        || character.equals('E')
        || character.equals('I')
        || character.equals('O')
        || character.equals('U'));
  }
}
