/**
 * @apiNote PlusOne class
 * @author David Kariuki
 * @version 1.0.0
 * @since 22/05/22 @Question Find Pivot Index
 * <p>You are given a large integer represented as an integer array digits, where each digits[i]
 * is the ith digit of the integer. The digits are ordered from most significant to least
 * significant in left-to-right order.
 * <p>The large integer does not contain any leading 0's. Increment the large integer by one and
 * return the resulting array of digits.
 */
package dk.learning.learn_dsa.array_and_string.questions;

public class PlusOne {

  public static void main(String[] args) {

    int[] digits = new int[] {1, 2, 3};
    System.out.println(plusOne(digits)); // Output: [1,2,4]

    digits = new int[] {4, 3, 2, 1};
    System.out.println(plusOne(digits)); // Output: [4,3,2,2]

    digits = new int[] {9};
    System.out.println(plusOne(digits)); // Output: [1,0]
  }

  public static int plusOne(int[] digits) {

    return -1;
  }
}
