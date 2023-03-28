public class Square extends Shape {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  public String getName() {
    return "Square (side=" + side + ")";
  }

  public double getArea() {
    return side * side;
  }

  public double getCircumference() {
    return side * 4;
  }
}
