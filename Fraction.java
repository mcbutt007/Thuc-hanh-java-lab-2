public class Fraction {

  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public Fraction add(Fraction other) {
    int newNumerator =
      numerator * other.denominator + other.numerator * denominator;
    int newDenominator = denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  public Fraction subtract(Fraction other) {
    int newNumerator =
      numerator * other.denominator - other.numerator * denominator;
    int newDenominator = denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  public Fraction multiply(Fraction other) {
    int newNumerator = numerator * other.numerator;
    int newDenominator = denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  public Fraction divide(Fraction other) {
    int newNumerator = numerator * other.denominator;
    int newDenominator = denominator * other.numerator;
    return new Fraction(newNumerator, newDenominator);
  }

  public static void main(String[] args) {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(3, 4);

    Fraction sum = f1.add(f2);
    System.out.println(
      "Sum: " + sum.getNumerator() + "/" + sum.getDenominator()
    );

    Fraction difference = f1.subtract(f2);
    System.out.println(
      "Difference: " +
      difference.getNumerator() +
      "/" +
      difference.getDenominator()
    );

    Fraction product = f1.multiply(f2);
    System.out.println(
      "Product: " + product.getNumerator() + "/" + product.getDenominator()
    );

    Fraction quotient = f1.divide(f2);
    System.out.println(
      "Quotient: " + quotient.getNumerator() + "/" + quotient.getDenominator()
    );
  }
}
