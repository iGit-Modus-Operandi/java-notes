/*
 *
 * FORMAT: while(condition) {};
 * FUNCTION: a variation of the while loop with no statements to execute if the condition is met.
 *   This may or may not be a typical programming scenario but it is possible. Many embedded
 *   systems are event driven, i.e. waiting for something to happen. Furthermore, events are
 *   commonly handled by hardware interrupts. Hence there might be nothing for the main program
 *   to do until an interrupt occurs.
 * IMPLEMENTATION: condition is a Boolean expression, one that evaluates to either true or false.
 *   No further statement is required inside the braces.
 *
 */

package controlStatements;

public class WhileLoopEmpty {

  public static void main(String[] args) {
    int i, j;
    i = 100;
    j = 200;

    // find midpoint between i and j
    while(++i < --j); // no body in this loop
    System.out.println("Midpoint is " + i);
  }
}
