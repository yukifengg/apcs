/*Princess Peach: Paul Serbanescu, Jaylen Zeng, Yuki Feng, David Deng
APCS
HW 26: GCD Three Ways
Time spent: 1.0 hr
*/

/*
QCC:
DISCO:
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
    }
}