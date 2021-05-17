package problemSolving2_Day21;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementSol1 {

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();

    a.add(2);
    a.add(1);
    a.add(1);
    System.out.println(majorityElement(a));

  }

  public static int majorityElement(final List<Integer> A) {

    int halfSize = A.size() / 2;
    for (int i = 0; i < (A.size() - 1) / 2; i++) {
      if (A.get(i) != A.get(i + 1)) {
        A.remove(i);
        A.remove(i + 1);
        i = i - 1;
      }
      if (A.size() <= halfSize) {
        break;
      }

    }
    return A.get(0);

  }

}
