package dk.learning.learn_dsa.array_and_string;
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

    int maxIndex = 0, dominantIndex = -1;

    for (int i = 0; i < nums.length; i++)
      if (nums[i] > nums[maxIndex]) maxIndex = i;

    for (int j = 0; j < nums.length; j++) {

      if (j != nums[maxIndex] && (nums[maxIndex] < (nums[j] * 2))) {
        return -1;
      } else {
        dominantIndex = j;
      }
    }

    return dominantIndex;
  }
}
