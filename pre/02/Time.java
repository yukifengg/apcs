import java.util.Scanner;
public class Time{
  public static void main(String[] args){
    int hour = 10;
    int minute = 46;
    int second = 40;
    System.out.println(hour);
    System.out.println(minute);
    System.out.println(second);
    System.out.println(hour*3600 + minute*60 + second + " seconds");
    System.out.println(24*3600 - (hour*3600 + minute*60 + second) + " seconds");
    double percDay = (38800.0 / (24.0*3600))*100.0;
    System.out.println(percDay + "%");
    int hour2 = 10;
    int minute2 = 53;
    int second2 = 26;
    System.out.println(hour2);
    System.out.println(minute2);
    System.out.println(second2);
    System.out.println((hour2*3600 + minute2*60 + second2) - (hour*3600 + minute*60 + second) + " seconds");
  }
}
