package arrays;

public class MultidimensionalArrays {

  public static void main(String[] args) {
    int[][] twoDimensionalArray = new int[5][5];
    int k = 0;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        twoDimensionalArray[i][j] = k;
        k++;
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(twoDimensionalArray[i][j] + " ");
      }
      System.out.println();
    }
  }
}
