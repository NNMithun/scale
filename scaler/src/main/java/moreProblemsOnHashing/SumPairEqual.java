package moreProblemsOnHashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SumPairEqual {

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(0);
    a.add(0);
    a.add(1);
    a.add(0);
    a.add(2);
    a.add(1);


    System.out.println(equal(a));
  }

  public static ArrayList<Integer> equal(ArrayList<Integer> A) {
    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
    ArrayList<ArrayList<Integer>> b = new ArrayList<>();

    for (int i = 0; i < A.size() - 1; i++) {
      for (int j = i + 1; j < A.size(); j++) {
        int sum = A.get(i) + A.get(j);
        if (hm.containsKey(sum)) {
          int si = hm.get(sum).get(0);
          int sj = hm.get(sum).get(1);
          if (si != i && si != j && sj != i && sj!=j) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(si);
            a.add(sj);
            a.add(i);
            a.add(j);
            b.add(a);
            if (b.size() > 1) {
              if (
                  b.get(0).get(0) < b.get(1).get(0)
                      ||
                      (b.get(0).get(0) == b.get(1).get(0) &&
                          b.get(0).get(1) < b.get(1).get(1))
                      ||
                      (b.get(0).get(0) == b.get(1).get(0) &&
                          b.get(0).get(1) == b.get(1).get(1) &&
                          b.get(0).get(2) < b.get(1).get(2))
                      ||
                      (b.get(0).get(0) == b.get(1).get(0) &&
                          b.get(0).get(1) == b.get(1).get(1) &&
                          b.get(0).get(2) == b.get(1).get(2) &&
                          b.get(0).get(3) < b.get(1).get(3))
              ) {
                b.remove(1);
              } else {
                b.remove(0);
              }
            }
          }
        } else {
          ArrayList<Integer> a = new ArrayList<>();
          a.add(i);
          a.add(j);
          hm.put(sum, a);
        }

      }
    }
    if (b.size() != 0) {
      return b.get(0);
    } else {
      return new ArrayList<>();
    }
  }

}
