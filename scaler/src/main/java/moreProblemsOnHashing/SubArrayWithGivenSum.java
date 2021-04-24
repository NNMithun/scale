package moreProblemsOnHashing;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);

    solve(a, 16);


  }

  public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
    int sum = 0;
    int i = 0;
    int j = 0;
    while (j < A.size() ||i < A.size() ) {
      if (sum < B) {
        if(i==A.size()){
          break;
        }
        sum += A.get(i);
        i++;
      } else if (sum > B) {
        sum -= A.get(j);
        j++;
      } else {
        ArrayList<Integer> c = new ArrayList<>();
        for (int k = j; k < i; k++) {
          c.add(A.get(k));
          System.out.println(A.get(k));
        }
        return c;

      }

    }

    ArrayList<Integer> c = new ArrayList<>();
    c.add(-1);
    System.out.println(-1);

    return c;

  }

}
