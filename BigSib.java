/*
Yuki Feng + Kosta Dubovskiy
Duckies: Paul + Davie
APCS
HW 10 – What Are BigSibs Good For?
2021 10 4
*/

/*
Discoveries:
The errors popping up with void type not expected was bc you cant print void value. When it is not a void method that you change it to some return type.
Questions:
Why can't we just do this like HW 09 where we left the print in the greet method?
*/

public class  BigSib {
	public static void main(String[] args) {
    System.out.println(BigSib.greet("Crosby"));
    System.out.println(BigSib.greet("Stills"));
    System.out.println(BigSib.greet("Nash"));
	}
	public static String greet(String name) {
		return ("Why, hello there, " + name + ". How do you do?");
	}
}
