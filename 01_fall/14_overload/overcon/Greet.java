/*
Purple Turtle- Yuki Feng (Paul), Ivina Wang (Sealie), Faiyaz Rafee (Pivot and Atlas)
APCS
HW14 – Customize Your Creation
2021 10 7
*/

/*
DISCO:
QCC: is using overloading constructors the preferred way for flexibility?
*/

public class Greet{
  public static void main( String[] args) {
    String greeting;

    BigSib richard = new BigSib();
    BigSib grizz = new BigSib();
    BigSib dotCom = new BigSib();
    BigSib tracy = new BigSib();
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
