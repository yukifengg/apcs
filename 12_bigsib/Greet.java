/*
Yuki Feng + Ivina Wang
Duckies: Paul + Sealie
APCS
HW 12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021 10 5
*/

/*
DISCO:
you can set a new message so that the variables come together to print out the greeting.
QCC:
i am also receiving this error:
cannot access BigSib
		BigSib person = new BigSib();
		^
  bad source file: ./BigSib.java
    file does not contain class BigSib
    Please remove or make sure it appears in the correct subdirectory of the sourcepath.

i am still confused on setting variables. I think it is because you have to say the type of variable it is and then also assign it a value.
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
}
