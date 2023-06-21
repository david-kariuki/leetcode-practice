/**
 * @apiNote DiagonalTraverse class
 * @author David Kariuki
 * @version 1.0.0
 * @since 20/06/23 @Question Find Pivot Index
 *     <p>Given an m x n matrix mat, return an array of all the elements, of the array in a diagonal
 *     order.
 *     <p>Constraints: m == mat.length n == mat[i].length 1 <= m, n <= 104 1 <= m * n <= 104 -105 <=
 *     mat[i][j] <= 105
 */
package dk.learning.learn_dsa.array_and_string.questions.diagonal_traverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DiagonalTraverseApproach1 {

  public static void main(String[] args) {

    int[][] mat = {
      {
        1, 2, 3,
      },
      {4, 5, 6},
      {7, 8, 9}
    };
    System.out.println(Arrays.toString(findDiagonalOrder(mat)));
  }

  public static int[] findDiagonalOrder(int[][] matrix) {

    // Check for empty matrices
    if (matrix == null || matrix.length == 0) {
      return new int[0];
    }

    // Variables to track the size of the matrix
    int matrixLength = matrix.length;
    int rowLength = matrix[0].length;

    int[] resultOrderArray = new int[matrixLength * rowLength];
    int k = 0;
    ArrayList<Integer> intermediate = new ArrayList<>();

    // Go over all the elements in the first row and last column to cover
    // all possible diagonals
    int numberOfDiagonals = matrixLength + rowLength - 1;
    for (int i = 0; i < numberOfDiagonals; i++) {

      intermediate.clear(); // clear intermediate with each iteration

      // We need to figure out the head of this diagonal
      // The elements in the first row and last column are the respective heads
      int row = i < rowLength ? 0 :  i - rowLength + 1;
      int column = i < rowLength ? i : rowLength - 1;

      // Iterate until one f the indices goes out of scope
      while (row < matrixLength && column > -1) {
        intermediate.add(matrix[row][column]);
        ++row;
        --column;
      }

      // Reverse even numbered diagonals
      if (i % 2 == 0) Collections.reverse(intermediate);

      for (int j = 0; j < intermediate.size(); j++) {
      resultOrderArray[k++] = intermediate.get(j);
      }
    }

    return resultOrderArray;
  }
}
