/*
Purple Turtle- Yuki Feng (Paul), Ivina Wang (Sealie), Faiyaz Rafee (Pivot and Atlas)
APCS
HW14 – Customize Your Creation
2021 10 7
*/

/*
DISCO:
i tried to use a for loop and an array because i couldnt wrap my head around the overloading without changing the variable
QCC:
i made it loop but it loops for each name which is not i want.
*/
import java.util.*;

public class BigSib{
  public String helloMsg;

  public BigSib(){
  }

  public BigSib(String hello){
    helloMsg = hello;
  }

  public String greet(String name){
    String[] helloMsg = {"Word up", "Saluations", "Hey ya", "Sup"};
    for (String i: helloMsg) {
      System.out.println(i + " " + name);
    }
    return null;
  }
}
