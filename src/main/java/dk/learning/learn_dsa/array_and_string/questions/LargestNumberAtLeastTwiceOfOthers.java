package dk.learning.learn_dsa.array_and_string.questions;

/**
 * @apiNote class
 * @author David Kariuki
 * @version 1.0.0
 * @since 5/23/23 @Question Largest Number At Least Twice of Others
 *     <p>You are given an integer array nums where the largest integer is unique.
 *     <p>Determine whether the largest element in the array is at least twice as much as every
 *     other number in the array. If it is, return the index of the largest element, or return -1
 *     otherwise.
 */
public class LargestNumberAtLeastTwiceOfOthers {

  public static void main(String[] args) {

    int[] nums = new int[] {3, 6, 1, 0};
    System.out.println(dominantIndex(nums));
  }

  public static int dominantIndex(int[] nums) {

    int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, index = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max1) {
        max2 = max1; // Replace max 1 into 2
        max1 = nums[i];
        index = i;
      } else if (nums[i] > max2) {
        max2 = nums[i];
      }
    }
    return (max2 * 2) <= max1 ? index : -1; // Compare first and second max
  }
}
