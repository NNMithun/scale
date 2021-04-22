package problemsOnArrays;

public class SubSequenceInString {

  public static void main(String[] args) {

  }
  public static int solve(String A) {
    int count=0;
    int ans=0;
    for(int i=0;i<A.length();i++){
      if (A.charAt(i)=='A'){
        count++;
      }
      if(A.charAt(i)=='G'){
        ans+=count;
      }
    }
    return ans;

  }

}
