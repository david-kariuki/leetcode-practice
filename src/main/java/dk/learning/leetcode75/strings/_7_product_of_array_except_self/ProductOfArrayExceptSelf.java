/**
 * @apiNote class
 * @author David Kariuki
 * @question Product of Array Except Self
 *     <p>Given an integer array nums, return an array answer such that answer[i] is equal to the
 *     product of all the elements of nums except nums[i].
 *     <p>The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *     <p>You must write an algorithm that runs in O(n) time and without using the division
 *     operation.
 * @example Example 1:
 *     <p>Input: nums = [1,2,3,4] Output: [24,12,8,6]
 * @example Example 2:
 *     <p>Input: nums = [-1,1,0,-3,3] Output: [0,0,9,0,0]
 * @constraints Constraints:
 *     <p>2 <= nums.length <= 105 -30 <= nums[i] <= 30 The product of any prefix or suffix of nums
 *     is guaranteed to fit in a 32-bit integer.
 * @complexityanalysis Complexity Analysis
 *     <p>
 * @timecomplexity -
 *     <p>
 * @spacecomplexity -
 *     <p>
 * @since dd/08/23
 * @see <a href="https://leetcode.com/problems/>--</a>
 */
package dk.learning.leetcode75.strings._7_product_of_array_except_self;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

  public static void main(String[] args) {

    // Example 1:
    int[] nums = {1, 2, 3, 4};
    System.out.printf(
        "\n\nInput :%s\nOutput : %s",
        Arrays.toString(nums), Arrays.toString(productExceptItself(nums))); // Output: [24,12,8,6]

    // Example 2:
    nums = new int[] {-1, 1, 0, -3, 3};
    System.out.printf(
        "\n\nInput :%s\nOutput : %s",
        Arrays.toString(nums), Arrays.toString(productExceptItself(nums))); // Output: [0,0,9,0,0]
  }

  private static int[] productExceptItself(int[] nums) {
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {

      long prodVal = 1;
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          prodVal *= nums[j];
        }
      }
      result[i] = prodVal;
    }

    return result;
  }
}
