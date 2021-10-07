/*
Yuki Feng
APCS
HW 13 -- Where do BigSibs Come From
2021 9 30
*/

/*DISCO:
I can reference it outside of the class but I wonder what the point of the constrcutor is?
QCC:
I have so many errors lol.
	2 errors
	Yukis-Air:13_hatch YukiFeng$ javac Greet.java
	Greet.java:35: error: illegal start of expression
	public static void SetHelloMsg(String hello){
	^
	Greet.java:39: error: class, interface, or enum expected
	}
*/

public class Greet {
	public static void main(String[] args) {
		String greeting;

		BigSib person = new BigSib();
		person.setHelloMsg("Word up");
		greeting = person.greet("freshman");
		System.out.println(greeting);

		BigSib person = new BigSib();
		person.setHelloMsg("Salutations");
		greeting = person.greet("Dr. Spaceman");
		System.out.println(greeting);

		BigSib person = new BigSib();
		person.setHelloMsg("Hey ya");
		greeting = person.greet("Kong Fooey");
		System.out.println(greeting);

		BigSib person = new BigSib();
		person.setHelloMsg("Sup");
		greeting = person.greet("mom");
		System.out.println(greeting);
	}

	public String BigSib(String hello){
		String helloMsg;
	public static void SetHelloMsg(String hello){
	    helloMsg = hello;
	  }
	}
}
