/**
Java Coffee: Yuki Feng, Courtney Huang, Jason Yang
APCS
HW34 -- A Pirate's life for Me // using arrays
2021-11-13
time spent: 1 hour
DISCO
- You can't use parenthesis after .length of an array
- You have to declare a static array if you want the methods to work on a preexisting array
QCC
- How would we implement recursion without creating a seperate method that takes more parameters?
**/

import java.util.Random;
import java.util.Arrays;

public class Loopier {

    static int[] arrayTest;

    public static int[] populateArray (int size){
        Random random = new Random();
        arrayTest = new int[size];
        for (int i = 0; i < arrayTest.length; i++) {
        arrayTest[i] = random.nextInt(10); // only random numbers from 1 to 10, can change the range, but made it smaller to easily test the frequency method
    }
    return arrayTest;
} ///populates an array with random ints


    public static String arrayToString(int [] arrayName) {
			// return Arrays.toString(arrayName); // converts the array to string using square [] brackets
        String begin = "{";
        for (int i = 0; i < arrayName.length - 1 ; i++){
            begin = begin + arrayName[i] + ",";
        }
        return begin + arrayName [arrayName.length - 1] +  "}";
    } /// converts the array to a string


     public static int linSearch( int[] a, int target ){
         for (int i = 0; i < a.length; i++){
             if (a[i] == target){
                 return i;
             }
         }
         return -1;
     } /// finds the first occurance of an integer in the array using interation

		 private static int search(int[] a, int target, int i){
			 if (i >= a.length){
				 return -1;
			 }
			 else if (a[i] == target){
				 return i;
			 }
			 else {
				 return search(a, target, i+1); // cannot do i++ because of post-increment
			 }
		 } // used a different method to help linSearchR that could take i as a parameter

      public static int linSearchR( int[] a, int target){
				return search(a, target, 0);
      } /// finds the first occurance of an integer in the array using recursion


      public static int freq( int[] a, int target ){
          int answer = 0;
          for (int i = 0; i < a.length; i++){
              if (a[i] == target){
                  answer = answer + 1;
              }
          }
          return answer;
      } /// finds frequency of a target in the array using iteration

			private static int frequency(int[] a, int target, int i, int ans){
				if (i == a.length){
					return ans;
				}
				else if (a[i] == target){
					ans = ans + 1;
					return frequency(a, target, i+1, ans); // cannot do i++ because of post-increment
				}
				return frequency(a, target, i+1, ans);
 		 } // used a different method to help freqRec that could take i and answer as a parameter

       public static int freqRec( int[] a, int target ){
           return frequency(a, target, 0, 0);
       } /// finds frequency of a target in the array using recursion


    public static void main(String [] args){
        populateArray(20);
        System.out.println("Array in string format is: " + arrayToString(arrayTest));
        System.out.println("Index of the first occurance of the target number is: " + linSearch(arrayTest, 6));
        System.out.println("Index of the first occurance of the target number is (with recursion): " + linSearchR(arrayTest, 6));
        System.out.println("Frequency of target number is: " + freq(arrayTest, 6));
        System.out.println("Frequency of target number is (with recursion): " + freqRec(arrayTest, 6));
    }
}
