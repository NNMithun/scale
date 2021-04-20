package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class PairsWithGivenXor {

  public static void main(String[] args) {

  }

  private static int pairsWithGivenXor(ArrayList<Integer> A, int B){
    HashMap<Integer,Integer> h= new HashMap<>();
    int count=0;

    for (int a:A){
      if(h.containsKey(a^B)){
         count++;
      }else {
        h.put(a,1);
      }
    }

    return count;
  }
}
