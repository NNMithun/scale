package Maths2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllFactors {

  public static void main(String[] args) {
    System.out.println(solve(Arrays.asList(2, 3, 4, 5)));
  }
  public static ArrayList<Integer> solve(List<Integer> A) {
    ArrayList<Integer> ans= new ArrayList<>();
    int count;
    for (int i=0;i<A.size();i++){
      ans.add(findFactorsCount(A.get(i)));
    }
    return ans;
  }

  private static Integer findFactorsCount(Integer n) {
    int count=0;
    System.out.println();

    for(int i=1;i<=Math.sqrt(n);i++){
      if(n%i==0){
        if (n / i == i) {
          count++;
          System.out.print(i+" ");
        }else {
          System.out.print(i+" ");
          System.out.print(n/i+" ");
          count+=2;
        }
      }
    }
    return count;
  }
}
