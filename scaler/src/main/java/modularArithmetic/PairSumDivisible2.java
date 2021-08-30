package modularArithmetic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairSumDivisible2 {

  public static void main(String[] args) {
    System.out.println(solve(Arrays.asList(1, 2, 3, 4, 5),2));


  }

  public static int solve(List<Integer> A, int B) {

    HashMap<Integer,Integer> hm= new HashMap<>();
    int pairs=0;
    for(int i=0;i<A.size();i++){
      int mod=A.get(i)%B;
      int com=B-mod==B?0:B-mod;
      if(hm.containsKey(com))pairs+=hm.get(com);
      if(hm.containsKey(mod))hm.put(mod,hm.get(mod)+1);
      if(!hm.containsKey(mod))hm.put(mod,1);


    }
    return pairs%(int)Math.pow(10,9)+7;

  }



}
