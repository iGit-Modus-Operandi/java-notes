package variables;

public class TypePromotion {

  public static void main(String[] args) {
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;
    double result = (f * b) + (i / c) - (d * s);

    System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
    System.out.println("Result = " + result);
  }
}

/*
  In the first subexpression, f * b, b is promoted to a float and the result of the subexpression is float.
  In the subexpression i/c, c is promoted to int, and the result is of type int.
  In d * s, the value of s is promoted to double, and the type of the subexpression is double.
  These three intermediate values, float, int, and double, are considered.
  The outcome of float plus an int is a float.
  The resultant float minus the last double is promoted to double, which is the type for the final result of the expression.
*/