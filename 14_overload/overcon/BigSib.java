/*
Purple Turtle- Yuki Feng (Paul), Ivina Wang (Sealie), Faiyaz Rafee (Pivot and Atlas)
APCS
HW14 – Customize Your Creation
*/

/*
DISCO:
QCC:
*/

public class BigSib{
  private String helloMsg;

  public BigSib(String hello){
    helloMsg = hello;
  }

  public String greet(String name){
    return (helloMsg + " " + name);
  }
}
