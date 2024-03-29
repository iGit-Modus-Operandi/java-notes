package dataStructures.stack;

import java.util.Stack;

public class StackSample {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    // Adding an element to the stack using push method
    System.out.println("START main");
    stack.push("main");

    System.out.println("START builder");
    stack.push("builder");

    System.out.println("START external-service");
    stack.push("external-service");

    System.out.println("START parse-external-data");
    stack.push("parse-external-data");

    // Removing an element to the stack using pop method
    System.out.println("END " + stack.pop());
    System.out.println("END " + stack.pop());
    System.out.println("END " + stack.pop());

    // Viewing the top-most element without removing it from the stack
    System.out.println(stack.peek());
  }
}
