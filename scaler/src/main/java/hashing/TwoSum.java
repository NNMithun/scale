package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

  public static void main(String[] args) {

  }

  public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
    HashMap<Integer, Integer> h = new HashMap<>();
    ArrayList<Integer> c = new ArrayList<>();

    for (int i = 0; i < A.size(); i++) {
      if (h.containsKey(B - A.get(i))) {
        c.add(h.get(B - A.get(i)));
        c.add(i + 1);
        return c;

      } else {
        if (!h.containsKey(A.get(i)))
        h.put(A.get(i), i + 1);
      }
    }
    return c;


  }

}
