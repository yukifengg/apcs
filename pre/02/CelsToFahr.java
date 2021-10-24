import java.util.Scanner;
public class CelsToFahr {
  public static void main (String[] args){
    double celsius, fahrenheit;
    Scanner in = new Scanner(System.in);
    System.out.print("Type in degrees celsius:");
    celsius = in.nextDouble();
    fahrenheit = (9.0/5.0) * celsius + 32.0;
    System.out.println(celsius + " C = " + fahrenheit + " F");
  }
}
