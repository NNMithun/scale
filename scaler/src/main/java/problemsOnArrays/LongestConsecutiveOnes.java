package problemsOnArrays;

import java.util.ArrayList;

public class LongestConsecutiveOnes {

  public static void main(String[] args) {

    String a= "1111";
    System.out.println(solve(a));;

  }

  public static int solve(String A) {
    ArrayList<Integer> prefixSum = new ArrayList<>();
    ArrayList<Integer> suffixSum = new ArrayList<>();
    Integer sum = 0;
    Integer ans = 0;
    Integer l = 0;
    Integer r = 0;

    prefixSum = prefixSumCalculator(A);
    suffixSum = suffixSumCalculator(A);
    sum = TotalSum(A);
    boolean all1= true;

    for (int i = 0; i < A.length(); i++) {

      if (A.charAt(i) == '0') {
        l = prefixSum.get(i);
        r = suffixSum.get(i + 1);
        if (l + r < sum) {
          ans = Math.max(ans, l + r + 1);

        } else {
          ans = Math.max(ans, l + r);
        }
        all1=false;
      }


    }

    if (all1==true){
      ans=prefixSum.get(A.length());
    }
    return ans;

  }

  private static Integer TotalSum(String a) {
    int totalSum=0;
    for(int i=0;i<a.length();i++){
      if(a.charAt(i)=='1'){
        totalSum++;
      }
    }
    return totalSum;
  }

  private static ArrayList<Integer> prefixSumCalculator(String a) {
    ArrayList<Integer> prefixSum= new ArrayList<>();

    prefixSum.add(0);
    int count=0;
    for(int i=0;i<a.length();i++){
      if(a.charAt(i)=='1'){
        count++;
      }
      else {
        count=0;
      }
      prefixSum.add(count);
    }
    return prefixSum;
  }

  private static ArrayList<Integer> suffixSumCalculator(String a) {
    ArrayList<Integer> suffixSum= new ArrayList<>();

    for (int i=0;i<a.length()+1;i++){
      suffixSum.add(0);
    }

    int count=0;
    for(int i=a.length()-1;i>=0;i--){
      if(a.charAt(i)=='1'){
        count++;
      }
      else {
        count=0;
      }
      suffixSum.set(i,count);
    }
    return suffixSum;
  }


}
