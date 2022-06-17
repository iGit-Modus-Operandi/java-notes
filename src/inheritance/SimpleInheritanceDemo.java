package inheritance;

public class SimpleInheritanceDemo {

  public static void main(String[] args) {
    SuperClassA superOb = new SuperClassA();
    SubClassB subOb = new SubClassB();

    // The superclass may be used by itself.
    superOb.i = 10;
    superOb.j = 20;
    System.out.println("Contents of superOb: ");
    superOb.showij();
    System.out.println();

    /* The subclass has access to all public members of its superclass. */
    subOb.i = 7;
    subOb.j = 8;
    subOb.k = 9;
    System.out.println("Contents of subOb: ");

    subOb.showij();
    subOb.showk();
    System.out.println();
    System.out.println("Sum of i, j and k in subOb:");
    subOb.sum();
  }
}
