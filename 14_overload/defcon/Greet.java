/*
urple Turtle- Yuki Feng (Paul), Ivina Wang (Sealie), Faiyaz Rafee (Pivot and Atlas)
APCS
HW14 – Customize Your Creation
*/

/*
DISCO:
QCC:
*/

public class Greet {
  public static void main( String[] args) {
    String greeting;

    BigSib richard = new BigSib("Word up");
    BigSib grizz = new BigSib("Hey ya");
    BigSib dotCom = new BigSib("Sup");
    BigSib tracy = new BigSib("Salutions");
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    greeting = tracy.greet("Dr. Spaceman");
    System.out.println(greeting);
    greeting = grizz.greet("Kong Fooey");
    System.out.println(greeting);
    greeting = dotCom.greet("mom");
    System.out.println(greeting);
  }
}
