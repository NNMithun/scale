package twoDimensional;

import java.util.ArrayList;

public class PatternPrinting {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> b= new ArrayList<ArrayList<Integer>>();
    b=solve(4);
    System.out.println(b);

  }

  public static ArrayList<ArrayList<Integer>> solve(int A) {

    ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> b= new ArrayList<Integer>();

    //set all to zero

    for (int i=0;i<=A-1;i++){
      b= new ArrayList<Integer>();
      for (int j=0;j<=A-1;j++){
        b.add(0);
      }
      a.add(b);
    }

    for (int row=0;row<=A-1;row++){
      int num=1;
      for (int col=0; col<=row;col++){
          a.get(row).set(A-1-col,num++ );
      }
    }

    return a;
  }

}
