package dataStructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    //Adding elements to the queue
    queue.add(2);
    queue.add(3);
    queue.add(19);
    queue.add(20);

    //Removing element to the queue
    // method's result is assigned to a variable then printed afterwards
    int removedItem = queue.remove();
    System.out.println(removedItem);
    System.out.println();

    // Alternative method of removing element
    // method is invoked as parameter to the printing method
    System.out.println(queue.remove());
    System.out.println();

    // Method for inspecting the head element without removing it from the queue
    System.out.println(queue.peek());
    System.out.println();

    // Method for iterating through the queue, each time removing an element
    while (!queue.isEmpty()){
      System.out.println(queue.remove());
    }
  }
}
