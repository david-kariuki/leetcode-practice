/**
 * @author David Kariuki
 * @apiNote ArrayIntroduction class
 * @since 22/05/22
 */
package dk.learning.learn_dsa.array_and_string;

import java.util.Arrays;

public class ArrayIntroduction {
  // "static void main" must be defined in a public class.

  public static void main(String[] args) {

    // 1. Initialize
    int[] a0 = new int[5];
    int[] a1 = {1, 2, 3};

    // 2. Get Length
    System.out.println("The size of a1 is: " + a1.length);

    // 3. Access Element
    System.out.println("The first element is: " + a1[0]);

    System.out.print("[Version 1] The contents of a1 are:");

    for (int i = 0; i < a1.length; ++i) {
      System.out.print(" " + a1[i]);
    }

    System.out.println();
    System.out.print("[Version 2] The contents of a1 are:");
    for (int item : a1) {
      System.out.print(" " + item);
    }

    System.out.println();

    // 5. Modify Element
    a1[0] = 4;

    // 6. Sort
    Arrays.sort(a1);
  }
}
