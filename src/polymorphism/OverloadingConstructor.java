package polymorphism;

public class OverloadingConstructor {

  public static void main(String[] args) {
    // create boxes using the various constructors
    Box myBox1 = new BoxBuilder().setW(10).setH(20).setD(15).createBox();
    Box myBox2 = new BoxBuilder().createBox();
    Box myCube = new BoxBuilder().setLen(7).createBox();
    double vol;

    // get volume of first box
    vol = myBox1.volume();
    System.out.println("Volume of mybox1 is " + vol);

    // get volume of second box
    vol = myBox2.volume();
    System.out.println("Volume of mybox2 is " + vol);

    // get volume of cube
    vol = myCube.volume();
    System.out.println("Volume of mycube is " + vol);
  }
}

class Box {
  double width;
  double height;
  double depth;

  // constructor used when all dimensions specified
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // constructor used when no dimensions specified
  Box() {
    width = -1; // use -1 to indicate
    height = -1; // an uninitialized
    depth = -1; // box
  }

  // constructor used when cube is created
  Box(double len) {
    width = height = depth = len;
  }

  // compute and return volume
  double volume() {
    return width * height * depth;
  }
}