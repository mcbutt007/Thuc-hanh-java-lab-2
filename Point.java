public class Point {

  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point other) {
    int dx = x - other.x;
    int dy = y - other.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public static void main(String[] args) {
    Point p1 = new Point(0, 1);
    Point p2 = new Point(3, 3);
    double dist = p1.distance(p2);
    System.out.println("Distance : " + dist);
  }
}
