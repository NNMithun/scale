package stringManipulation;

public class ReverseTheString {

  public static void main(String[] args) {

    String a =
        "       fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq                 ";
    System.out.println(solve(a));


  }

  public static String solve(String A) {
    StringBuilder B = new StringBuilder();

    int j = A.length();
    for (int i = A.length() - 1; i >= 0; i--) {

      if (A.charAt(i) == ' ') {
        if (j - i != 1) {
          B.append(A.substring(i + 1, j));
          B.append(" ");
          j = i;
        } else {
          j = i;
        }
      }
      if (i == 0 && A.charAt(i) != ' ') {
        B.append(A.substring(i, j));
      }



    }

    if(B.charAt(B.length()-1)==' '){
      B.deleteCharAt(B.length()-1);
    }



    return String.valueOf(B);
  }
}
