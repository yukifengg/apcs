/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
*/

public class xyzThere {
  public static boolean xyzThere(String str) {
    int xyzCount = 0;
    for (int i = 0; i <str.length()-4; i++) {
      if (str.substring(i,i+4).equals(".xyz")) {
        xyzCount = 0;
      } else if (str.substring(i,i+3).equals("xyz")) {
        xyzCount += 1;
      }
    } return ((xyzCount)>0);
  }

  public static void main(String[] args) {
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("xyz.abc"));
  }
}
