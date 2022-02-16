/*
Given a non-negative int n, return the sum of its digits recursively (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide
(/) by 10 removes the rightmost digit (126 / 10 is 12).
*/
public class sumDigits {
  public static int sumDigits(int n) {
    return ((n%10) + (n / 10));
  }

  public static void main(String[] args) {

  }
}
