package week3;

import java.util.ArrayList;

public class PascalTriangle {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
    pascal = solve(9);
    System.out.println(pascal);

  }

  public static ArrayList<ArrayList<Integer>> solve(int A) {
    ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> row = new ArrayList<Integer>();
    Integer pascalNumber = 11;

    for (int i = 0; i <= A-1; i++) {
      row = new ArrayList<Integer>();
      pascalNumber = (int) Math.round(Math.pow(11, i));

      while (pascalNumber != 0) {
        row.add(pascalNumber % 10);
        pascalNumber = pascalNumber / 10;
      }
      pascal.add(row);
    }
    return pascal;

  }
}
