/**
 * @apiNote class
 * @author David Kariuki
 * @since 5/22/23
 */
package dk.learning.learn_dsa.array_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DynamicArray {

  public static void main(String[] args) {

    List<Integer> v0 = new ArrayList<>();
    List<Integer> v1;

    Integer[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    v1 = new ArrayList<>(Arrays.asList(a));

    List<Integer> v2 = v1; // Make a copy
    List<Integer> v3 = new ArrayList<>(v1); // Make an actual copy of v1

    System.out.println("The size of v1 is: " + v1.size());
    System.out.println("The first element in v1 is: " + v1.get(0));

    System.out.print("[Version 1] The contents of v1 are:");
    for (int i = 0; i < v1.size(); ++i) {
      System.out.print(" " + v1.get(i));
    }
    System.out.println();
    System.out.print("[Version 2] The contents of v1 are:");
    for (int item : v1) {
      System.out.print(" " + item);
    }
    System.out.println();

    v2.set(0, 5); // Modify element

    System.out.println("The first element in v1 is: " + v1.get(0));

    v3.set(0, -1); // Modify element
    System.out.println("The first element in v1 is: " + v1.get(0));

    Collections.sort(v1); // Sort elements

    v1.add(-1); // Add element
    v1.add(1, 6);

    v1.remove(v1.size() - 1); // Remove last element
  }
}
