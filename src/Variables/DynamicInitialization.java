package Variables;

public class DynamicInitialization {

  public static void main(String[] args) {
    double a = 3, b = 4;

    // c is dynamically initialized
    double c = Math.sqrt(a * a + b * b);
    System.out.println("The hypotenuse is equal to " + c + " units");
  }
}
