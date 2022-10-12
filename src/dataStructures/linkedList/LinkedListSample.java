package dataStructures.linkedList;

import java.util.LinkedList;

public class LinkedListSample {

  public static void main(String[] args) {
    LinkedList<String> sins = new LinkedList<>();
    // Adding elements on a list
    sins.add("Greed");
    sins.add("Envy");
    sins.add("Gluttony");
    sins.add("Lust");
    sins.add("Pride");
    sins.add("Sloth");
    sins.add("Anger");

    //Displaying number of items within a list
    System.out.println(sins.size());

    //Finding the existence of an element or value within a list
    System.out.println(sins.contains("Disgust"));

    // Remove first element/item added on the list
    sins.removeFirst();

    // forEach loop that iterates through the list and prints every element
    for (String sin: sins) {
      System.out.print(sin + "-->");
    }
  }
}
