/*
Java Coffee - Yuki Feng, Jason Yang, Courtney Huang
APCS
Hw 47: Guess Again
Time Spent: .5 hours
*/

/*
DISCO:
QCC:
*/

import java.util.Scanner;
public class GuessNumber {
  /*initialization of the variables where:
    _lo and _hi sets the range of the guessing respectively
    _guessCtr counts how many guesses the user takes to reach _target
    _target is the target number we are aiming to guess
  */
  private int _lo, _hi, _guessCtr, _target;
  //initialization of new scanner
  Scanner sc = new Scanner(System.in);

  public GuessNumber(int a, int b) {
    _lo = Math.min(a,b); //sets _lo to min number
    _hi = Math.max(a,b); //sets _hi to max number
    _guessCtr = 1; //user cannot get target without guessing
    _target = (int)(Math.random() * (b-a+1)) + a;
    //randomizes target number
    //(b-a+1) insures that _target doesn't go over the max
    //adding a ensures that _target doesn't go under min
  }

  public void playRec() {
    System.out.print("Guess a number between " + _lo + "and " + _hi + ": ");
    int guess = sc.nextInt();
    if (guess == _target) {
      System.out.println("YASSSSS! You got the correct number.")
    }
  }

  public static void main(String[] args) {

  } //ends main
} //ends class
