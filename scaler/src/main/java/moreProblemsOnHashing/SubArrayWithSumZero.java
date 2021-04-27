package moreProblemsOnHashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithSumZero {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add(-1);
    a.add(-2);
    a.add(-3);
    a.add(5);

    solve(a);
    System.out.println(solve(a));

  }

  public static int solve(ArrayList<Integer> A) {

    HashMap<Integer,Integer> hm= new HashMap<>();
    hm.put(A.get(0),0);
    int prefixSum=A.get(0);


    for(int i=1;i<A.size();i++){
      prefixSum+=A.get(i);
      if(hm.containsKey(prefixSum)|| hm.containsKey(0)){
        return 1;
      }
      else {
        hm.put(prefixSum,i);
      }
    }
    return 0;


  }
}
