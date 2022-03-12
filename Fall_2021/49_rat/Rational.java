/*
Java Coffee: Courtney Huang, Yuki Feng, Jason Yang
APCS
HW49 -- Rational Standards Compliance
12/22/21
time: 1hr
2021-12-23
*/

/*
DISCO:
We can use "instaceof" to see if an Object is an instance of a certain class.
throw new ClassCastException allows you to custom your own error message
QCC:
what if there were two different objects as inputs?
*/


public class Rational{
    private int denominator;
    private int numerator;

    public Rational(){
        denominator = 1;
        numerator = 0;
    }

    public Rational (int num, int den){
        denominator = den;
        numerator = num;
        if (denominator == 0){
          System.out.println("invalid denominator, set new number to 0/1");
          denominator = 1;
          numerator = 0;
        }
        else {
          denominator = den;
          numerator = num;
        }
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    public float floatValue(){
        return ((float)(this.numerator))/((float)(this.denominator));
    }

    public void multiply(Rational a){
        this.numerator = this.numerator * a.numerator;
        this.denominator = this.denominator * a.denominator;
    }

    public void divide(Rational a){
        this.numerator = this.numerator * a.denominator;
        this.denominator = this.denominator * a.numerator;
}

    public void add(Rational a){
      int num1 = this.numerator * a.denominator;
      int num2 = this.denominator * a.numerator;
      numerator = num1 + num2;
      denominator = this.denominator * a.denominator;
    }

    public void subtract(Rational a){
      int num1 = this.numerator * a.denominator;
      int num2 = this.denominator * a.numerator;
      numerator = num1 - num2;
      denominator = this.denominator * a.denominator;
    }

    public int gcd(int num, int den) {
      while (num != den){
        if (num > den) {
          num -= den;
        } else if (den > num){
          den -= num;
        }
      }return num;
    }

    public void reduce() {
      int divisor = this.gcd(this.numerator, this.denominator);
      this.numerator = this.numerator / divisor;
      this.denominator = this.denominator / divisor;
    }

    public int compareTo(Object other){
    if (other instanceof Rational) {
      Rational r = (Rational) other;

      return (this.numerator * r.denominator) - (this.denominator * r.numerator);
    }
    throw new ClassCastException("\n CompareTo() input not a Rational");
  }

  public boolean equals(Object other) {
    if (other instanceof Rational) {
      Rational r = (Rational) other;
      return this.compareTo(r) == 0;
    }
    return false;
  }
}
