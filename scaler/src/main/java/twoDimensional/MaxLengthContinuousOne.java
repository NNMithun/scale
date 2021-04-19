package twoDimensional;

public class MaxLengthContinuousOne {

  public static void main(String[] args) {
    solve("010100110101");

  }
  public static int solve(String A) {
    int max_count=Integer.MIN_VALUE;
    int count=0;

    for (int i=0;i<A.length();i++){
      if(A.substring(i,i+1).equals("1")){
        count++;
      }else {
        if (max_count<count){
          max_count=count;
        }
        count=0;

      }
      if (max_count<count){
        max_count=count;
      }

    }
    System.out.println(max_count);


    return max_count;
  }


}
