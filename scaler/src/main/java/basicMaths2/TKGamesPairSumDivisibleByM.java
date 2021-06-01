package basicMaths2;

import java.util.ArrayList;

public class TKGamesPairSumDivisibleByM {

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
    int[] tracker = new int[A.size()];
    int pairs = 0;
    for (Integer a :A) {
      int mod = a % B;
      pairs += tracker[((B - mod) % B)];
      tracker[mod]++;
    }
    return pairs;

  }

}
