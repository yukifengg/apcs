public class questions03 {
  public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
  }

  public static void main(String[] args) {
      System.out.print("No, I ");
      zoop();
      System.out.print("I ");
      baffle();
  }

  public static void baffle() {
      System.out.print("wug");
      ping();
  }

  public static void ping() {
      System.out.println(".");
      // baffle();
  }
}

/*
1.1. The output is:
    No, I wug.
    You wugga wug.
    I wug.
1.2. I dont know how to insert a stack diagram so im gonna format the text like it is one and you can imagine the frames drawn around them.
    main | zoop: "No, I " | baffle: "I "
    zoop | print: "You wugga"
    baffle | print: "wug"
    ping | print: "."
1.3. You will add "wug" after the period, which is what the system will output, but it doesnt know when to stop so you print "wug." forever.
*/
