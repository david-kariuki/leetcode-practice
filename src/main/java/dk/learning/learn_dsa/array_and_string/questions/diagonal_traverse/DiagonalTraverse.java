/**
 * @apiNote DiagonalTraverse class
 * @author David Kariuki
 * @version 1.0.0
 * @since 20/06/23 @Question Find Pivot Index
 * <p>Given an m x n matrix mat, return an array of all the elements, of the array in a diagonal order.</p>
 * <p>
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 104
 * 1 <= m * n <= 104
 * -105 <= mat[i][j] <= 105
 * </p>
 */
package dk.learning.learn_dsa.array_and_string.questions.diagonal_traverse;

import java.util.Arrays;

public class DiagonalTraverse {

    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }

    private static int[] findDiagonalOrder(int[][] mat) {

        int[] diagonalOrder = new int[]{};


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                if (j == 0) {
                    diagonalOrder[j] = mat[i][0];
                }

                if (mat.length - 1 > i) {
                    break;
                }
            }
        }

        return diagonalOrder;
    }
}
