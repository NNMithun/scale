package stringManipulation;

public class StringRotation {

  public static void main(String[] args) {
    solve("jadgbxjesitcdbnbkftdv", 29);
  }

  public static String solve(String A, int B) {
    String c = "";
    if (A.length() == B || B == 0) {
      return A;
    } else{
    if(B>A.length()){
      B=B%A.length();
    }
      c = A.substring(A.length() - B);
      c = c.concat(A.substring(0, A.length() - B));
    }


    return c;
  }

}
