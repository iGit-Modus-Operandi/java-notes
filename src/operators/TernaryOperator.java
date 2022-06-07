/*
 * FORMAT: expression1 ? expression2 : expression3;
 * FUNCTION: compact alternative for some if-else conditions
 * IMPLEMENTATION: expression1 can be any expression that evaluates to a boolean value.
 * If expression1 is true, then expression2 is evaluated.
 * Otherwise, expression3 is evaluated.
 */

package operators;

public class TernaryOperator {

  public static void main(String[] args) {
    int i, k;

    i = 10;
    k = i < 0 ? -i : i; // get absolute value of i
    System.out.print("Absolute value of ");
    System.out.println(i + " is " + k);

    i = -10;
    k = i < 0 ? -i : i; // get absolute value of i
    System.out.print("Absolute value of ");
    System.out.println(i + " is " + k);
  }
}
