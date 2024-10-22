package polymorphism;

public class BoxBuilder {

  private double w;
  private double h;
  private double d;
  private double len;

  public BoxBuilder setW(double w) {
    this.w = w;
    return this;
  }

  public BoxBuilder setH(double h) {
    this.h = h;
    return this;
  }

  public BoxBuilder setD(double d) {
    this.d = d;
    return this;
  }

  public BoxBuilder setLen(double len) {
    this.len = len;
    return this;
  }

  public Box createBox() {
    return new Box(w, h, d);
  }
}
