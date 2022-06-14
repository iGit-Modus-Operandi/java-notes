package classes;

class ParameterizedConstructor {

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

/* Here, Box uses a parameterized constructor to initialize the dimensions of a box. */
class BoxParameterized {

  double width;
  double height;
  double depth;

  // This is the constructor for Box.
  BoxParameterized(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // compute and return volume
  double volume() {
    return width * height * depth;
  }
}