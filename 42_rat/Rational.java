/*
Java Coffee: Courtney Huang, Yuki Feng, Jason Yang
APCS
HW42: Be More Rational
2021-12-02
time: 0.5 hr
*/

/*
DISCO:
you can use gcd as helper in reduce to find the divisor that you will use to divide numerator and denominator of the constructor it is invoked upon
QCC:

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

    public static int gcd(int num, int den) {
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

    public int compareTo(Rational a){
      Rational w = new Rational(this.numerator, this.denominator);
      w.subtract(a);
      return w.numerator;
    }

    public static void main(String [] args){
        Rational r = new Rational(2,3); //Stores rational number 2/3
        Rational s = new Rational(1,2); //Stores rational number 1/2
        Rational t = new Rational(4,18); //Stores the rational number 4/18
        // r.multiply(s); //Multiplies r by s, updates r to 2/6.  s remains 1/2
        // r.divide(s); //divides r by s, changes r to 4/3, s remains 1/2
        // r.add(s); // adds s to r, updates r to 7/6, s remains 1/2
        // r.subtract(s); // subtracts s from r, updates r to 1/6, s remains 1/2
        // System.out.println(gcd(4,18)); //finds gcd of 4 and 18 -> 2
        t.reduce(); //reduces t to simplest form, 4/18 -> 2/9 ;
        System.out.println("r: \n fraction: " + r.toString() + "\n float: " + r.floatValue());// r
        System.out.println("s: \n fraction: " + s.toString() + "\n float: " + s.floatValue());// s
        System.out.println("t: \n fraction: " + t.toString() + "\n float: " + t.floatValue());// t

        // Rational w = new Rational(4,0);
        // System.out.println(w.toString());
        System.out.println(r.compareTo(t));
        System.out.println(r.compareTo(r));
        System.out.println(s.compareTo(r));
    }
}
