/*
* FORMAT: if(condition) statement;
* FUNCTION: determines the flow of execution based on whether some condition is true or false
* IMPLEMENTATION: condition is a Boolean expression, one that evaluates to either true or false.
* If condition is true, then the statement is executed.
* If condition is false, then the statement is bypassed.
*/

package controlStatements;

public class IfStatement {

  public static void main(String[] args) {
    int x, y;
    x = 10;
    y = 20;

    if (x < y) {
      System.out.println("x is less than y");
    }
    x = x * 2; // x*=2;

    if (x == y) {
      System.out.println("x now equal to y");
    }
    x = x * 2; // x*=2;

    if (x > y) {
      System.out.println("x now greater than y");
    }

    // this won't display anything
    if (x == y) {
      System.out.println("you won't see this");
    }
  }
}
