package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;

public class GravityFlip {

  public static void main(String[] args) {
    int [] a= {3,2,2,1};
    int[] b=solve(a);
    for (int i=0;i<b.length;i++){
      System.out.println(b[i]);
    }
  }


  public static int[] solve(int[] A) {
    ArrayList<Integer> a= new ArrayList<>();
    for (int i=0;i<A.length;i++){
      a.add(A[i]);

    }

    Collections.sort(a);

    for (int i=0;i<A.length;i++){
      A[i]=a.get(i);
    }
    return A;
  }
}
