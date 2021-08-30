package modularArithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSumDivisible {

  public static void main(String[] args) {
    System.out.println(solve(Arrays.asList(1, 2, 3, 4, 5),2));

  }

  public static int solve(List<Integer> A, int B) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int count = 0;
    for (int i = 0; i < A.size(); i++) {
      if (hashMap.containsKey(A.get(i) % B)) {
       hashMap.put(A.get(i)%B, hashMap.get(A.get(i)%B)+1);
      }else {
        hashMap.put(A.get(i)%B, 0);
      }

    }
    for (Integer  e:hashMap.values()) {
      count+=e;

    }
    return count;
  }
}
