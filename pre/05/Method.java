public class Method {
  public static void main(String[] args){
    System.out.println(isDivisble(6,3));
    System.out.println(isDivisble(7,2));

    System.out.println(isTriangle(3,4,5));
    System.out.println(isTriangle(5,10,17));

    System .out.println(ack(1,5));
  }

  public static boolean isDivisble(int n, int m) {
    return n%m == 0;
  }

  public static String isTriangle(int a, int b, int c) {
    if (a > b + c || b > a + c || c > a + b) {
      return "not triangle";
    }
    return "is triangle";
  }

  public static int ack(int m, int n) {
    if (m == 0) {
      return n+1;
    }
    if (m > 0 && n == 0) {
      return ack(m - 1, 1);
    }
    if (m > 0 && n > 0) {
      return ack(m-1, ack(m, n-1));
    }
    return 0;
  }
}
