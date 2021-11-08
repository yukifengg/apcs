/* 
MYLE - May Qiu, Yuki Feng, Lindsay Phung
APCS
LAB 00
8 November 2021
*/

public class Pig {
   private static final String VOWELS = "aeiou";
   public static boolean hasA (String w, String letter ) {
      return w.indexOf(letter) != -1;
   }
   
   public static boolean isAVowel(String letter) {
      return VOWELS.indexOf(letter) != -1;
   }
   
   public static int countVowels(String w) {
      return allVowels(w).length();
   }
   
   public static boolean hasAVowel(String w) {
      return w.indexOf(w) >= 0;
   }
   
   public static String allVowels(String w) {
      String ans = "";
      for (int i = 0; i < w.length(); i++) {
         if (isAVowel(w.substring(i,i+1)))
            ans += w.substring(i, i+1);
            
}
