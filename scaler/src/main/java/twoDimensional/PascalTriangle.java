package twoDimensional;

import java.util.ArrayList;

public class PascalTriangle {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
    pascal = solve(9);
    System.out.println(pascal);

  }

  public static ArrayList<ArrayList<Integer>> solve(int A) {
    ArrayList<ArrayList<Integer>> b= new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> a= new ArrayList<Integer>();

    if (A>=1){
      a.add(1);
      b.add(a);
    }
    if (A>=2){
      a= new ArrayList<Integer>();
      a.add(1);
      a.add(1);
      b.add(a);
    }


    ArrayList<Integer> c=a;

    for (int i=2;i<A;i++){
       a= new ArrayList<Integer>();
       a.add(1);
      for (int k=1;k<i;k++){
        a.add(c.get(k)+c.get(k-1));
      }
      a.add(1);
      c=a;
      b.add(a);

    }

    return b;

  }
}
