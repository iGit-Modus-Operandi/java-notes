/*
 * Also known as pre-test loop
 * FORMAT: while(condition) statement;
 * FUNCTION: allows code to be executed repeatedly based on a given Boolean condition
 * IMPLEMENTATION: condition is a Boolean expression, one that evaluates to either true or false.
 *    The statement is executed for as long as the condition is TRUE.
 *    Else, the loop ends.
 */

package controlStatements;

public class WhileLoop {

  public static void main(String[] args) {
    int n = 10;

    while(n > 0) {
      System.out.println("tick " + n);
      n--;
    }
  }
}
