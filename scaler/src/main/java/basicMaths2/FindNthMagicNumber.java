package basicMaths2;

public class FindNthMagicNumber {

  public static void main(String[] args) {

    System.out.println(solve(10));;

  }
  public static int solve(int A) {
    int ans=0;

    for (int i=0;i<32;i++){
      int b=A>>i;
      if((b&1)==1){

      ans+=Math.pow(5,(i+1));
      }
    }

    return ans;

  }

}
