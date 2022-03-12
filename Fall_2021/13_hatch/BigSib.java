/*
Paul the Sealie
APCS
HW 13 – Where do BigSibs Come From?
2021 10 6
*/

/*
DISCO:
you can do public void and set the string outside as instance variable to call it.
QCC:
I keep on getting this error:
  Main method not found in class BigSib, please define the main method as:
   public static void main(String[] args)
  or a JavaFX application class must extend javafx.application.Application
*/

public class BigSib{
  String helloMsg;

  public void SetHelloMsg(String hello){
    helloMsg = hello;
  }
  public String Greet(String name){
    return (helloMsg + " " + name);
  }
}
