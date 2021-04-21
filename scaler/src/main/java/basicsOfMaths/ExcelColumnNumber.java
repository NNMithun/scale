package basicsOfMaths;

public class ExcelColumnNumber {

  public static void main(String[] args) {
    String a="aaA";
    titleToNumber("ABCD");

  }
  public static  int titleToNumber(String A) {
    int b=0;

    for (int i=0;i<A.length();i++){

     b+=(Integer.valueOf(A.charAt(A.length()-1-i))-64)*Math.pow(26,i);

    }

    return b;

  }

}
