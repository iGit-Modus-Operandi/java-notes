package classes.innerClass;

class Outer {

  int outer_x = 100;

  void test() {
    Outer.Inner inner = new Outer.Inner();
    inner.display();
  }

  // this is an inner class
  class Inner {

    void display() {
      System.out.println("display: outer_x = " + outer_x);
    }
  }
}
