package dataStructures.hashMap;

import java.util.HashMap;

public class DisplayFrequency {

  public static void main(String[] args) {
    displayFrequencyOfElement(new int[] {4,1,3,4,5,8,3,4,4,4,4,6,5});
  }

  private static void displayFrequencyOfElement(int[] arr) {
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    for (int x : arr ) {
      if (!frequencyMap.containsKey(x)){
        frequencyMap.put(x, 1);
      } else {
        frequencyMap.put(x, frequencyMap.get(x) + 1);
      }
    }
    frequencyMap.forEach((key, value) -> System.out.println(key + " : " + value));
  }
}
