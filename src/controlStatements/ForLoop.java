/*
* FORMAT: for(initialization; condition; iteration) statement;
* FUNCTION: provide a way to repeatedly execute some task
* IMPLEMENTATION: In its most common form, the initialization portion of the loop sets a loop
*    control variable to an initial value. The condition is a Boolean expression that tests the
*    loop control variable.
*    If the outcome of that test is true, statement executes and the for loop continues to iterate.
*    If it is false, the loop terminates.
*    The iteration expression determines how the loop control variable is changed each time the
*    loop iterates.
*/

package controlStatements;

public class ForLoop {

  public static void main(String[] args) {
    int x;

    for(x = 0; x<10; x++)
      System.out.println("This is x: " + x);
  }
}
