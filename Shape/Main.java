class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(5);
    System.out.println(circle.getName() + " area: " + circle.getArea());
    System.out.println(
      circle.getName() + " circumference: " + circle.getCircumference()
    );

    Shape rectangle = new Rectangle(3, 4);
    System.out.println(rectangle.getName() + " area: " + rectangle.getArea());
    System.out.println(
      rectangle.getName() + " circumference: " + rectangle.getCircumference()
    );

    Shape square = new Square(5);
    System.out.println(square.getName() + " area: " + square.getArea());
    System.out.println(
      square.getName() + " circumference: " + square.getCircumference()
    );

    Shape triangle = new Triangle(3, 4, 5);
    System.out.println(triangle.getName() + " area: " + triangle.getArea());
    System.out.println(
      triangle.getName() + " circumference: " + triangle.getCircumference()
    );
  }
}
