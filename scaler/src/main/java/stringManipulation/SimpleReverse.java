package stringManipulation;

public class SimpleReverse {

  public static void main(String[] args) {

    solve("abcde");
  }

  public static String solve(String A) {

    StringBuilder s= new StringBuilder();
    for(int i=0; i<A.length();i++){
      s.append(A.charAt(A.length()-1-i));

    }
    System.out.println(s);

    return s.toString();

  }

}
