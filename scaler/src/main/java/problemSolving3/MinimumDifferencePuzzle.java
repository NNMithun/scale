package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDifferencePuzzle {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList= new ArrayList<>();
    //A : [ 10, 12, 10, 7, 5, 22 ]
    arrayList.add(10);
    arrayList.add(12);
    arrayList.add(10);
    arrayList.add(7);
    arrayList.add(5);
    arrayList.add(22);
    System.out.println(solve(arrayList,4));
  }
  public static int solve(ArrayList<Integer> A, int B) {

    Collections.sort(A);
    int minDiff=Integer.MAX_VALUE;
    for (int i=0;i<A.size()-(B-1);i++){
      if (minDiff>A.get(i+(B-1))-A.get(i)){
        minDiff=A.get(i+B-1)-A.get(i);
      }
    }

    return minDiff;

  }

}
