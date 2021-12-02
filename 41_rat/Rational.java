// Java Coffee: Courtney Huang, Yuki Feng, Jason Yang
// APCS
// HW41: Be Rational
// 2021-12-01
// time: 0.5 hr
//
// DISCO: Using keyword this. reduces confusion when you have two objects
// QCC: In the main method, why doesn't r.divide(s) use the original values of object r if java if pass-by-value?


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

    public static void main(String [] args){
        Rational r = new Rational(2,3); //Stores rational number 2/3
        Rational s = new Rational(1,2); //Stores rational number 1/2
        r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
        System.out.println(r.toString());
        System.out.println(s.toString());
        r.divide(s);
        System.out.println(r.toString());// r changes to 4/6 from 2/6
        System.out.println(s.toString());// s remains 1/2
        System.out.println(r.floatValue());
        System.out.println(s.floatValue());

        Rational w = new Rational(4,0);
        System.out.println(w.toString());

    }
}
