/**
 * @apiNote class
 * @author David Kariuki
 * @question Kids With the Greatest Number of Candies
 *     <p>There are n kids with candies. You are given an integer array candies, where each
 *     candies[i] represents the number of candies the ith kid has, and an integer extraCandies,
 *     denoting the number of extra candies that you have.
 *     <p>Return a boolean array result of length n, where result[i] is true if, after giving the
 *     ith kid all the extraCandies, they will have the greatest number of candies among all the
 *     kids, or false otherwise.
 *     <p>Note that multiple kids can have the greatest number of candies.
 * @example Example 1:
 *     <p>Input: candies = [2,3,5,1,3], extraCandies = 3
 *     <p>Output: [true,true,true,false,true]
 *     <p>Explanation: If you give all extraCandies to: - Kid 1, they will have 2 + 3 = 5 candies,
 *     which is the greatest among the kids.
 *     <p>Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 *     <p>Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
 *     <p>Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
 *     <p>Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 * @example Example 2:
 *     <p>Input: candies = [4,2,1,1,2], extraCandies = 1
 *     <p>Output: [true,false,false,false,false]
 *     <p>Explanation: There is only 1 extra candy.
 *     <p>Kid 1 will always have the greatest number of candies, even if a different kid is given
 *     the extra candy.
 * @example Example 3:
 *     <p>Input: candies = [12,1,12], extraCandies = 10
 *     <p>Output: [true,false,true]
 * @constraints Constraints:
 *     <p>n == candies.length
 *     <p>2 <= n <= 100
 *     <p>1 <= candies[i] <= 100
 *     <p>1 <= extraCandies <= 50
 * @complexityanalysis
 *     <p>Here, n is the number of kids.
 * @timecomplexity: O(n)
 *     <p>We iterate over the candies array to find out maxCandies which takes O(n) time.
 *     <p>We iterate over the candies array once more.
 *     <p>We check for each kid whether they will have the most candies among all the children after
 *     receiving extraCandies and push the result in result which takes O(1) time. It requires O(n)
 *     time for n kids.
 * @spacecomplexity: O(1)
 *     <p>Without counting the space of input and output, we are not using any space except for some
 *     integers like maxCandies and candy.
 * @since 20/07/23
 * @see <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/">Kids With
 *     the Greatest Number of Candies</a>
 */
package dk.learning.leetcode75.strings._3_kids_with_greatest_no_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

  public static void main(String[] args) {

    // Example 1:
    int[] candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;
    System.out.printf(
        "\n\nArray : %s, Result : %s ",
        Arrays.toString(candies),
        Arrays.toString(new List[] {kidsWithCandies(candies, extraCandies)}));

    // Example 2:
    candies = new int[] {4, 2, 1, 1, 2};
    extraCandies = 1;
    System.out.printf(
        "\n\nArray : %s, Result : %s ",
        Arrays.toString(candies),
        Arrays.toString(new List[] {kidsWithCandies(candies, extraCandies)}));

    // Example 3:
    candies = new int[] {12, 1, 12};
    extraCandies = 10;
    System.out.printf(
        "\n\nArray : %s, Result : %s ",
        Arrays.toString(candies),
        Arrays.toString(new List[] {kidsWithCandies(candies, extraCandies)}));
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

    List<Boolean> result = new ArrayList<>(candies.length);
    int maxCandies = 0, i = 0;

    for (int childCandies : candies) if (childCandies > maxCandies) maxCandies = childCandies;

    for (int childCandies : candies) result.add(i++, (childCandies + extraCandies) >= maxCandies);

    return result;
  }
}
