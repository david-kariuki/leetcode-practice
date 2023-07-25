/**
 * @apiNote CanPlaceFlowers class
 * @author David Kariuki
 * @question Can Place Flowers
 *     <p>You have a long flowerbed in which some plots are planted, and some are not. However,
 *     flowers cannot be planted in adjacent plots.
 *     <p>Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means
 *     not empty, and an integer n, return true if n new flowers can be planted in the flowerbed
 *     without violating the no-adjacent-flowers rule and false otherwise.
 * @example Example 1:
 *     <p>Input: flowerbed = [1,0,0,0,1], n = 1
 *     <p>Output: true
 * @example Example 2:
 *     <p>Input: flowerbed = [1,0,0,0,1], n = 2
 *     <p>Output: false
 * @constraints
 *     <p>1 <= flowerbed.length <= 2 *
 *     <p>104
 *     <p>flowerbed[i] is 0 or 1.
 *     <p>There are no two adjacent flowers in flowerbed.
 *     <p>0 <= n <= flowerbed.length
 * @since 20/07/23
 * @see <a
 *     href="https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75">
 *     Can Place Flowers</a>
 */
package dk.learning.leetcode75.strings._4_can_place_flowers;

import java.util.Arrays;

public class CanPlaceFlowersSingleScanApproach {

  public static void main(String[] args) {

    // Example 1:
    int n = 1;
    int[] flowerbed = {1, 0, 0, 0, 1};
    System.out.printf(
        "\n\n%s flower(s) planted in %s without violating adjacent rule %s",
        n, Arrays.toString(flowerbed), canPlaceFlowers(flowerbed, n));

    // Example 2:
    n = 2;
    flowerbed = new int[] {1, 0, 0, 0, 1};
    System.out.printf(
        "\n\n%s flower(s) planted in %s without violating adjacent rule %s",
        n, Arrays.toString(flowerbed), canPlaceFlowers(flowerbed, n));

    // Example 3:
    n = 2;
    flowerbed = new int[] {1, 0, 0, 0, 0, 0, 0, 0, 1};
    System.out.printf(
        "\n\n%s flower(s) planted in %s without violating adjacent rule %s",
        n, Arrays.toString(flowerbed), canPlaceFlowers(flowerbed, n));
  }

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {

    int count = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0) {

        if (((i == 0) || (flowerbed[i - 1] == 0))
            && ((i == flowerbed.length - 1) || (flowerbed[i + 1] == 0))) {
          flowerbed[i] = 1;
          count++;
        }
      }
    }
    return count >= n;
  }
}
