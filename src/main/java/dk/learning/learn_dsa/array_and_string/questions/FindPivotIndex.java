/**
 * @apiNote FindPivotIndex class
 * @author David Kariuki
 * @since 22/05/23 @Question Find Pivot Index
 * <p>Given an array of integers nums, calculate the pivot index of this array. The pivot index
 * is the index where the sum of all the numbers strictly to the left of the index is equal to
 * the sum of all the numbers strictly to the index's right.
 * <p>If the index is on the left edge of the array, then the left sum is 0 because there are no
 * elements to the left. This also applies to the right edge of the array. Return the leftmost
 * pivot index. If no such index exists, return -1.
 */
package dk.learning.learn_dsa.array_and_string.questions;

public class FindPivotIndex {

  public static void main(String[] args) {

    int[] nums = new int[] {1, 7, 3, 6, 5, 6};
    System.out.println(pivotIndex(nums));
  }

  public static int pivotIndex(int[] nums) {

    int arraySum = 0, leftSum = 0;

    for (int i : nums) arraySum += i;

    for (int j = 0; j < nums.length; j++) {
      if (leftSum == arraySum - leftSum - nums[j]) return j;
      leftSum += nums[j];
    }
    return -1;
  }
}
