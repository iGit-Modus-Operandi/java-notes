/*
 *
 * FORMAT: for(type variableName : arrayName) {statement};
 * FUNCTION: Used exclusively to loop through elements or traverse in an array or collection
 * IMPLEMENTATION: The loop execute the indicated executable statement as it traverse or go through
 *    each item of the array or collection. The loop ends once it exhaust all the element of the
 *    array or collection.
 *
 */

package controlStatements;

public class ForEach {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;

    // use for-each style for to display and sum the values
    for(int x : nums) {
      System.out.println("Value is: " + x);
      sum += x;
    }

    System.out.println("Summation: " + sum);
  }
}
