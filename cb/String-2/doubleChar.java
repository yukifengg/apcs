public String doubleChar(String str) {
  String hey = "";
  for (int i = 0; i<str.length(); i++) {
   hey += str.substring(i,i+1) + str.substring(i,i+1);
  } return hey;
}
