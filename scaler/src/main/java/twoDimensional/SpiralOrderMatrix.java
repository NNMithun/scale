package twoDimensional;

import java.util.ArrayList;

public class SpiralOrderMatrix {

  public static void main(String[] args) {

    ArrayList<ArrayList<Integer>> b= generateMatrix(1);
    System.out.println(b);

  }

  public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
    int left_col = 0, top_row = 0, right_col = A - 1, bottom_row = A - 1;
    ArrayList<ArrayList<Integer>> spiralSqMatrix = new ArrayList<ArrayList<Integer>>(A);
    ArrayList<Integer> a = new ArrayList<Integer>();

    for (int i = 0; i < A; i++) {
      a= new ArrayList<Integer>();
      for (int j= 0;j<A;j++){
        a.add(0);
      }
      spiralSqMatrix.add(a);
    }
    int count = 1;

    while (left_col <= right_col && top_row <= bottom_row) {

      for (int i = left_col; i <= right_col; i++) {
        spiralSqMatrix.get(top_row).set(i, count++);
      }
      top_row++;
      System.out.println(spiralSqMatrix);

      for (int i = top_row; i <= bottom_row; i++) {
        spiralSqMatrix.get(i).set(right_col, count++);
      }
      right_col--;
      System.out.println(spiralSqMatrix);


      for (int i = right_col; i >= left_col; i--) {
        spiralSqMatrix.get(bottom_row).set(i, count++);
      }
      bottom_row--;
      System.out.println(spiralSqMatrix);


      for (int i = bottom_row; i >= top_row; i--) {
        spiralSqMatrix.get(i).set(left_col, count++);
      }
      left_col++;
      System.out.println(spiralSqMatrix);


      System.out.println(spiralSqMatrix);
    }

    return spiralSqMatrix;

  }

}
