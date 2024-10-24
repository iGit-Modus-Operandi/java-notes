/*
*
* FORMAT: for(initialization; condition; iteration) statement;
* FUNCTION: provide a way to repeatedly execute some task
* IMPLEMENTATION: In its most common form, the initialization portion of the loop sets a loop
*   control variable to an initial value. The condition is a Boolean expression that tests the
*   loop control variable.
*     If the outcome of that test is true, statement executes and the for loop continues to
*   iterate.
*     If it is false, the loop terminates.
*     The iteration expression determines how the loop control variable is changed each time the
*   loop iterates.
* OUTPUT:
*     This is x: 0
*     This is x: 1
*     This is x: 2
*     This is x: 3
*     This is x: 4
*     This is x: 5
*     This is x: 6
*     This is x: 7
*     This is x: 8
*     This is x: 9
*
*/

package controlStatements;

public class ForLoop {

  public static void main(String[] args) {
    int x;

    for(x = 0; x<10; x++)
      System.out.println("This is x: " + x);
  }
}
