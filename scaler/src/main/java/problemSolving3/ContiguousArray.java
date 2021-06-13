package problemSolving3;

import java.util.ArrayList;
import java.util.HashMap;

public class ContiguousArray {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add(1);
    a.add(0);
    a.add(1);
    a.add(0);
    a.add(1);
    a.add(1);
    a.add(0);
    System.out.println(solve(a));

  }

  public static int solve(ArrayList<Integer> A) {

    //substitute -1 inplace of 0
    //calculate prefix sum
    //find the equal values as far as apart

    //substitute -1 inplace of 0
    for (int i=0;i<A.size();i++) {
      if(A.get(i)==0){
        A.set(i,-1);
      }
    }

    //calculate prefix sum
    ArrayList<Integer> B= new ArrayList<>();
    B.add(0);
    int prefixSum=0;
    for (int i=0;i<A.size();i++) {
      prefixSum+=A.get(i);
      B.add(prefixSum);
    }

    //find the equal values as far as apart
    HashMap<Integer,Integer> hm= new HashMap<>();
    int maxDistance=0;
    for (int i=0;i<B.size();i++) {
      if(hm.containsKey(B.get(i))){
        if(maxDistance<i-hm.get(B.get(i))){
          maxDistance=i-hm.get(B.get(i));
        }
      }
      else {
        hm.put(B.get(i),i);
      }

    }
    return maxDistance;

  }

}
