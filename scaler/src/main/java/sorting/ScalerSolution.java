package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ScalerSolution {

  public static void main(String[] args) {
    ArrayList<Integer> A= new ArrayList();
    A.add(-6);
    A.add(-1);
    A.add(4);


    System.out.println(    solve(A)
    );

  }
  public static int solve(ArrayList<Integer> A) {
    Collections.sort(A);

    int size = A.size();
    for(int i=0;i<size;i++){
      while(i+1<size && A.get(i)==A.get(i+1))
        i++;
      if(A.get(i)==size-1-i)
        return 1;
    }
    return -1;
  }


}
