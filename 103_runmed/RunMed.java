/*
TNPG Chocolate Freds: Anjini, Hamim, Yuki
APCS pd8
HW103 -- Erica's Friends, Hugo, and The One in the Middle
2022-05-19r
time spent: 1.0 hrs

DISCO:
 * The stuff in the closet is extra...though because of our incomplete implemetation
   we were unable to test it out :(
QCC:
 * Why oh why are we getting errors for using AL methods on a lil and big vals?
Algo:
*/


import java.util.ArrayList;

public class RunMed {

  private ALHeapMin lilVals;
  private ALHeapMax bigVals; 

  public RunMed(){
    lilVals = new ALHeapMin();
    bigVals = new ALHeapMax();
  }

  public double getMedian(){
    if ((lilVals._heap.size() + bigVals.size()) % 2 == 1){ //odd #
        int tot = (lilVals.size() + bigVals.size()) / 2;
        if (lilVals.size() < tot){
            tot = tot - lilVals.size();
            return bigVals.get(tot);
        }
        else{
            return (double) lilVals.get(tot);
        }
    else{ //even #
        int tot = (lilVals.size() + bigVals.size()) / 2;
        if (lilVals.size() < tot - 1){
            tot = tot - lilVals.size();
            double avg = (bigVals.get(tot) + bigVals.get(tot - 1)) / 2;
            return avg;
        }
        else if (lilVals.size() < tot){
            double avg = (lilVals.get(tot) + lilVals.get(tot - 1)) / 2;
            return avg;
        }
    }

    }
  }

  public Integer add(Integer newVal){
    if (bigVals.get(0) == null){
        bigVals.add(newVal);
    }
    else if (bigVals.minOf(newVal, bigVals.get(0)) != newVal){
        bigVals.add(newVal);
    }
    else{
        lilVals.add(newVal);
    }

    //balancing act
    if (bigVals.size() - lilVals.size() >= 2){
        Integer a = bigVals.removeMin();
        lilVals.add(a);
    }
    else if (lilVals.size() - bigVals.size() >= 2){
        Integer a = bigVals.removeMin();
        lilVals.add(a);
    }

  }

  public static void main( String[] args )
  {

    RunMed r = new RunMed();

    r.add(1);
    r.add(2);
    r.add(5);
    r.add(3);
    r.add(6);
    r.add(9);
    r.add(10);
    r.add(7);

  }//end main

}//end class

