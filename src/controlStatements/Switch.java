/*
 *
 * FORMAT: switch(expression) {case 'value1':  statement1; break; case 'value 2': statement2; break;
 *    ...}
 * FUNCTION: allows for the selection of one code blocks among many possible cases
 * IMPLEMENTATION: The switch expression is evaluated once.
 *    The value of the expression is compared with the values of each case.
 *    If there is a match, the associated block of code is executed.
 *    The break and default keywords are optional.
 *
 */

package controlStatements;

public class Switch {

  public static void main(String[] args) {
    for(int i=0; i<6; i++)
      switch(i) {
        case 0:
          System.out.println("i is zero.");
          break;
        case 1:
          System.out.println("i is one.");
          break;
        case 2:
          System.out.println("i is two.");
          break;
        case 3:
          System.out.println("i is three.");
          break;
        default:
          System.out.println("i is greater than 3.");
      }
  }
}
