// Frog hats: Kevin Cheng, Yuki Feng, Joshua Gao
// APCS pd8
// HW70: Thinkers of the Corn
// 2022-03-03r
// time spent:  hrs

/***
 * SKEELTON for
 * class MazeSolver
 * Implements a blind depth-first exit-finding algorithm.
 * Displays probing in terminal.
 *
 * USAGE:
 * $ java Maze [path/to/mazefile]
 * (mazefile is ASCII representation of a maze, using symbols below)
 *
 * ALGORITHM for finding exit from starting position:
 *  <INSERT YOUR SUMMARY OF ALGO HERE>
 *
 * DISCO
 *
 * QCC
 *
 ***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  final private int FRAME_DELAY = 50;

  private char[][] _maze;
  private int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~System~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
          w = line.length();

        for( int i=0; i<line.length(); i++ )
          _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }
      for( int i=0; i<w; i++ )
        _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void solve(int x,int y) -- recursively finds maze exit (depth-first)
   * @param x starting x-coord, measured from left
   * @param y starting y-coord, measured from top
   **/
   public void solve( int x, int y )
   {
     delay( FRAME_DELAY ); //slow it down enough to be followable

     //primary base case
     if ( _solved ) {
       System.out.println("Solution found!");
       System.exit(0);
     }
     //other base cases
     else if ( _maze[x][y] == EXIT ) {
       _solved = true;
 	     System.out.println( this );
       return;
     }
     //otherwise, recursively solve maze from next pos over,
     //after marking current location
     else {
       if (_maze[x][y] == PATH) {
         _maze[x][y] = HERO;
         System.out.println( this ); //refresh screen
         // go north
         solve(x,y-1);
         //go east
         solve(x+1,y);
         //go south
         solve(x, y+1);
         //go west
         solve(x-1,y);
         // sets visited path before refreshing screen
         _maze[x][y] = VISITED_PATH;
         System.out.println( this ); //refresh screen
       }
     } //end else
   } //end solve

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
    return (_maze[x][y] == PATH);
  }

}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile==null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "[2J" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    // ThinkerTODO: comment next line out when ready to randomize startpos
    // ms.solve( 4, 3 );

    //drop our hero into maze at random location on path
    // YOUR RANDOM-POSITION-GENERATOR CODE HERE
    int i = 0;
    while ( i < 80*25 ) {
      int startX = (int) (Math.random() * 80);
      int startY = (int) (Math.random() * 25);
      if (ms.onPath(startX, startY)) {
        ms.solve( startX, startY );
        break;
      }
      i++;
    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
