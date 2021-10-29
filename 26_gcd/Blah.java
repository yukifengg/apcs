public class blah {
	public static int gcdER( int a, int b ){
	    if (a!=b){
	      a=Math.max(a,b)-Math.min(a,b);
	      b=Math.min(a,b);
	      return gcdER(a,b);
	    }
	    return a;
	  }
	public static void main (String[] args) {
	System.out.println(gcdER(3, 3)); //expected: 3
	    System.out.println(gcdER(9, 15)); //expected: 3
	    System.out.println(gcdER(15, 18)); //expected: 3
	    System.out.println(gcdER(3, 14)); //expected: 1
	    System.out.println(gcdER(16, 28)); //expected: 4
	    System.out.println(gcdER(1, 40)); //expected: 1
	    System.out.println(gcdER(20, 12)); //expected: 4
	    System.out.println(gcdER(-20, -12)); //expected: not sure
	}
