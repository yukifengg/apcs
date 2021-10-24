public class Loops {
  public static void main(String[] args){
    System.out.println(power(2,3));
  }
  /* public static double squareRoot(double a) {
    int i;
    for (i=1; i <= a; i += 1 ) {
      double x = ( (a/2.0) + a/(a/2.0) ) / 2.0;
      if
    }
  } return x; */

  public static double power(double x, int n) {
    int i = 1;
    while (n != 0) {
      i *= x;
      --n;
    }
    return i;
  }
}
