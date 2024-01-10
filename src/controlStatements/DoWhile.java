/*
 *
 * Also known as an exit-controlled or post-tested loop
 * FORMAT: do{statement} while(condition);
 * FUNCTION: allows code to be executed at least once or for as long as the given Boolean condition
 *    is being fulfilled
 * IMPLEMENTATION: condition is a Boolean expression, one that evaluates to either true or false.
 *    The statement is executed at least once before the condition is checked.
 *    If the condition is TRUE, the statement is executed repeatedly.
 *    Else, the loop ends.
 *
 */

package controlStatements;

public class DoWhile {

  public static void main(String[] args) {
    int n = 10;

    do {
      System.out.println("tick " + n);
    } while(--n > 0);
  }
}

