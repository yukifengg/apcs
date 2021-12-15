/*
Java Coffee - Yuki Feng, Jason Yang, Courtney Huang
APCS
Hw 47: Guess Again
Time Spent: .5 hours
*/

/*
DISCO:
there is the chance of _lo and _hi becoming the same value so then we can end the guessing and revea; the number to user.
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
    System.out.print("Guess a number between " + _lo + " and " + _hi + ": ");
    int guess = sc.nextInt();
    if (_lo == _hi) {
      System.out.print("The number was " + _target);
      System.out.println("Number of tries: " + _guessCtr);
    }
    if (guess == _target) {
      System.out.println("YASSS!!! You got the correct number.");
      System.out.println("Number of tries: " + _guessCtr);
    }
    else if (guess > _target) {
      System.out.println("Too high!");
      _hi = guess-1;
      _guessCtr++;
      playRec();
    }
    else if (guess < _target) {
      System.out.println("Too low!");
      _lo = guess+1;
      _guessCtr++;
      playRec();
    }
  }

  public void playIter() {
    int guess;
    while (true){
      System.out.print("Guess a number between " + _lo + " and " + _hi + ": ");
      guess = sc.nextInt();
      if (_lo == _hi) {
        System.out.print("The number was " + _target);
        System.out.println("Number of tries: " + _guessCtr);
        break;
      }
      if (guess == _target) {
        System.out.println("YASSS!!! You got the correct number.");
        System.out.println("Number of tries: " + _guessCtr);
        break;
      }
      else if (guess > _target) {
        System.out.println("Too high!");
        _hi = guess-1;
      }
      else if (guess < _target) {
        System.out.println("Too low!");
        _lo = guess+1;
      }
      _guessCtr++;
    }
  }

  public void play() {
    playRec();
    //playIter();
  }

  public static void main(String[] args) {
    GuessNumber g = new GuessNumber(1,100);
    g.play();
  } //ends main
} //ends class
