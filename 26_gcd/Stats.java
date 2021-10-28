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
        int i;
        while (a!= b) {
            
        }
    }
    public static void main(String[] args) {
        //testing gcd
        System.out.println(gcd(9,15));
        System.out.println(gcd(14,48));
        System.out.println(gcd(0,16));
        System.out.println(gcd(1,1));
        
    }
}