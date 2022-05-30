package Variables;

public class PrimitiveTypes {

  public static void main(String[] args) {
    // variable names used for the following are for illustration purposes and must not be the convention for choosing one,
    // it must be descriptive of the type of data it contains

    // Integer types
    byte b = 42;
    short s = 1024;
    int i = 2022;
    long l = 123_456_789_000L;
        // recommended to use uppercase letter L to avoid confusion with 1 and small letter l
        // use underscore to indicate comma separator for large numbers

    // Floating-Point Numbers type
    float f = 1.23F;
    double d = 3.14159265;

    // Character type
    char c = 'M';

    // Boolean type
    boolean bool = true;

    System.out.println("Primitive Data Types");
    System.out.println("");
    System.out.println("byte: " +b);
    System.out.println("short: " +s);
    System.out.println("integer: " +i);
    System.out.println("long: " +l);
    System.out.println("");
    System.out.println("float: " +f);
    System.out.println("double: " +d);
    System.out.println("");
    System.out.println("char: " +c);
    System.out.println("");
    System.out.println("boolean: " + bool);
  }
}
