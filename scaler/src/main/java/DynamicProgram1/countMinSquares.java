package DynamicProgram1;

public class countMinSquares {

  public static void main(String[] args) {

    System.out.println(countMinSquares(10));  }

  public static int countMinSquares(int A) {
    int[] dp= new int[A+1];
   for(int i=0;i<A+1
       ;i++){
     dp[i]=i;
     for (int j=1; (j*j)<=i;j++){
       dp[i]=Math.min(dp[i],dp[i-(j*j)]+1);
     }
   }

    return dp[A];
  }

}
