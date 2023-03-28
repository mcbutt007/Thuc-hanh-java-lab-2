public class Triangle extends Shape {

  private double a;
  private double b;
  private double c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public String getName() {
    return "Triangle";
  }

  public double getArea() {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public double getCircumference() {
    return a + b + c;
  }
}
