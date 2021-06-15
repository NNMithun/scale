package april3_23_problemSolving4;

import java.util.ArrayList;

public class MinimizeTheAbsoluteDifference {

  public static void main(String[] args) {
    ArrayList<Integer> A= new ArrayList<>();
    ArrayList<Integer> B= new ArrayList<>();
    ArrayList<Integer> C= new ArrayList<>();

    A.add(1);
    A.add(4);
    A.add(5);
    A.add(8);
    A.add(10);

    B.add(6);
    B.add(9);
    B.add(15);

    C.add(2);
    C.add(3);
    C.add(6);
    C.add(6);

    System.out.println(solve(A,B,C));

  }

  public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
    int i = 0, j = 0, k = 0;
    int minimised = Integer.MAX_VALUE;
    while (i < A.size() && j < B.size() && k < C.size()) {
      int a=A.get(i);
      int b=B.get(j);
      int c=C.get(k);
      int max = Math.max(Math.max(a,b), c);
      int min = Math.min(Math.min(a, b), c);
      if (minimised > Math.abs(max - min)) {
        minimised = Math.abs(max - min);
      }

      if (a < b) {
        if (a < c) {
          i++;
        } else {
          k++;
        }
      } else {
        if (b < c) {
          j++;
        } else {
          k++;
        }
      }


    }
    return minimised;
  }

}
