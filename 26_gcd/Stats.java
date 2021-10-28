/*Princess Peach: Paul Serbanescu, Jaylen Zeng, Yuki Feng, David Deng
APCS
HW 26: GCD Three Ways
Time spent: 1.0 hr
*/

/*
QCC:
DISCO:
- for while loop you add
- for recursion you reduce and in recursion you call the function hence it is going back into the loop and calling upon itself.
ALGO:
the algorighim tests for whether the int a and int b are equal to each other. if they were that would automatically mean they are the gcd, so you can set it to either one of them. out of convenience we chose a.
then you use a loop to find the gcd by subtracting the smaller int from bigger int until both int a and b are equal to each other which is when you find the gcd.
in recursion, you keep on calling that formula until you reach it whereas in regular while loop you just stop once youve come to the equal.
*/
public class Stats {
    //private int i;

    public static int gcd(int a, int b) {
        int i;
        while (a != b) {
            i = 0;
            if (a == 0 || b == 0) {
                return 0;
            }
            else if (a > b) {
                a -= b;
            }
            else if (b > a) {
                b -= a;
            }
        }return a;
    }

    public static int gcdER(int a, int b) {
        while (a!= b) {
            if (a == 0 || b == 0) {
                return 0;
            }
            else if (a > b) {
                a -= b;
                return gcdER(a,b);
            }
            else {
                b -= a;
                return gcdER(a,b);
            }
        }return a;
    }

    public static int gcdEW(int a, int b) {
        int d1 = 1;
        while (d1 <= a) {
          if (a != b){a & f 0 || (Impressment) {
              d1++;
            }

            }
            else if (b > a) {
              return (b%a);
            }
          }return a;
    }
    public static void main(String[] args) {
        //testing gcd
        System.out.println(gcd(9,15)); // test with expected output 3
        System.out.println(gcd(0,16)); // a is 0. -> output 0
        System.out.println(gcd(1,1)); // same number -> output 1
        System.out.println(gcd(11,23)); // only common factor is 1 -> 1
        // testing gcdER
        System.out.println(gcdER(9,15)); // test with expected output 3
        System.out.println(gcdER(0,16)); // a is 0. -> 0
        System.out.println(gcdER(1,1)); // same number -> 1
        System.out.println(gcdER(11,23)); // only common factor is 1 -> 1
        // testing gcdEW
        System.out.println(gcdEW(9,15)); // test with expected output 3
        System.out.println(gcdEW(0,16)); // a is 0. -> 0
        System.out.println(gcdEW(1,1)); // same number -> 1
        System.out.println(gcdEW(11,23)); // only common factor is 1 -> 1
    }
}
