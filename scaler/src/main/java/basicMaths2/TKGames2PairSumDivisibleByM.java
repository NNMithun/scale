package basicMaths2;

import java.util.ArrayList;
import java.util.HashMap;

public class TKGames2PairSumDivisibleByM {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    System.out.println(solve(arrayList, 2));
    ;

  }

  public static int solve(ArrayList<Integer> A, int B) {
    HashMap<Integer,Integer> hm= new HashMap<>();
    int pairs = 0;
    for (int val:A) {
        int mod=val%B;
        int complement=B-mod==B?0:B-mod;

        if(hm.containsKey(complement)){
          pairs+=hm.get(complement);
        }
        if (hm.containsKey(mod)){
          hm.put(mod,hm.get(mod)+1);
        }
        if (!hm.containsKey(mod)){
          hm.put(mod,1);
        }
    }

    return pairs;
    
  }

}
