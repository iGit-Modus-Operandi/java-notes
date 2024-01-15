package classes.parametrizedConstructor;

public class ParameterizedConstructor {
  public static void main(String[] args) {
    // declare, allocate, and initialize Box objects
    BoxParameterized mybox1 = new BoxParameterized(10, 20, 15);
    BoxParameterized mybox2 = new BoxParameterized(3, 6, 9);

    double vol;
    // get volume of first box
    vol = mybox1.volume();
    System.out.println("Volume is " + vol);

    // get volume of second box
    vol = mybox2.volume();
    System.out.println("Volume is " + vol);
  }
}
