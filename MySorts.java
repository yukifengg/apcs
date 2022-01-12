/*
TNPG: Java Coffee: Courtney Huang, Jason Yang, Yuki Feng
APCS period 7
HW 55: One File to Bring Them All...
Time: .5 hrs
*/

/*
DISCO:
QCC:
*/

public class MySorts {

  public static int counter = 0;
  public static int swaps = 0;

  // VOID version of bubble
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubble( ArrayList<Comparable> data )
  {
    for (int pass = 0; pass < data.size(); pass++) {
      for (int index = data.size() - 1; index > pass; index--) {
        if (data.get(index).compareTo(data.get(index - 1)) == -1) {
          Comparable tempor = data.get(index);
          data.set(index, data.get(index - 1));
          data.set(index - 1, tempor);
          swaps++;
        } //end if block
      } //end index loop
      counter++;
    } //end pass loop
  } //end bubbleSort

  // VOID version of selection
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for (int pass = data.size() - 1; pass > 0; pass--) {
      maxPos = pass;
      System.out.println("\nbegin pass " + (data.size() - pass));// diag
      for (int i = 0; i < pass; i++) {
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
          swaps++;
        } //end if block
        System.out.println("maxPos: " + maxPos);// diag
        System.out.println(data);// diag
      } //end i loop
      // swap last element with element at maxPos.
      Comparable joemama = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, joemama);

      System.out.println("after swap: " + data);// diag
      //update pass counter
      counter++;
    } //end pass for loop
  } //end selection

  // VOID version of insertion
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertion(ArrayList<Comparable> data)
  {
    for (int partition = 1; partition < data.size(); partition++) {
      // partition marks first item in unsorted region
      System.out.println("\npartition: " + partition + "\tdataset:"); // diag
      System.out.println(data);
      // traverse sorted region from right to left
      for (int i = partition; i > 0; i--) {
        // "walk" the current item to where it belongs by swapping adjacent items
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i - 1)) == -1) {
          System.out.println("swap indices " + (i - 1) + " & " + i + "..."); // diag
          Comparable temp = data.get(i);
          data.set(i, data.get(i - 1));
          data.set(i - 1, temp);
        } else
          break;
      } //end i loop
      counter++;
    } //end parition loop
  } //end insertion
}//end class
