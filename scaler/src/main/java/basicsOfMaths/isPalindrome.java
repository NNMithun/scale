package basicsOfMaths;

public class isPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome(-2147447412));

  }
  public static int isPalindrome(int A) {
     int original=A;
     int temp=0;
     int rev=0;


      while (A!=0) {
         temp = A % 10;
         rev = rev * 10 + temp;
        A = A / 10;

      }
      if(rev==original){
        return 1;
      }else {
        return 0;
      }
  }

}
