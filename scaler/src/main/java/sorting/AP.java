package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class AP {

  public static void main(String[] args) {

  }
  public int solve(ArrayList<Integer> A) {
    Collections.sort(A);
    int commonDiff=0;

    if(A.size()>0){
      commonDiff=A.get(1)-A.get(0);
    }

    for(int i=1;i<=A.size()-2;i++)
    {
      if(commonDiff!=A.get(i)-A.get(i+1)){
        return -1;
      }

    }
    return 1;
  }
}
