package problemSolving2_Day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDiff {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add(97 );
    a.add(86 );
    a.add(67 );
    a.add(19 );
    a.add(107);
    System.out.println(solve(a));

  }
  public static int solve(ArrayList<Integer> A) {
    Collections.sort(A);
    int min=Integer.MAX_VALUE;
    for (int i =0;i<A.size()-1;i++){
      if(A.get(i+1)-A.get(i)<min){
        min=Math.abs(A.get(i+1)-A.get(i));
      }

    }
    return min;
  }
}
