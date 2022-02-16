/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
Compute the result recursively (without loops).
*/

public class Factorial {
  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    else {
      return (n*factorial(n-1));
    }
  }
  public static void main(String[] args) {
    System.out.println(factorial(4));
    System.out.println(factorial(5));
    System.out.println(factorial(6));
  }

}
