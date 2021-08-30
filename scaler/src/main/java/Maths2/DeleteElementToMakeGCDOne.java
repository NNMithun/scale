package Maths2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteElementToMakeGCDOne {

  public static void main(String[] args) {
    System.out.println(solve(Arrays.asList(4,6,9)));;

  }
  public static int solve(List<Integer> A) {
    int finalGCD=A.get(0);

    for(int i=1;i<A.size();i++){
    finalGCD=gcd(finalGCD,A.get(i));
  }
    if(finalGCD==1){
      return 0;
    }
   else{
     return -1;
    }
}

  public static int gcd(int dividend, int divisor)
  {
   if(divisor==0)return dividend;
   return gcd(divisor,dividend%divisor);
  }

}
