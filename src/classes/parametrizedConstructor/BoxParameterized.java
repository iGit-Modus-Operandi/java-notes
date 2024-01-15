package classes.parametrizedConstructor;

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
