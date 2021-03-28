package twoDimensional;

import java.util.ArrayList;
//https://www.geeksforgeeks.org/return-an-array-of-anti-diagonals-of-given-nn-square-matrix/
public class AntiDiagonal {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> A=  new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> b= new ArrayList<Integer>();
    b.add(1);
    b.add(2);
    b.add(3);
    A.add(b);

    b= new ArrayList<Integer>();
    b.add(4);
    b.add(5);
    b.add(6);
    A.add(b);


    b= new ArrayList<Integer>();
    b.add(7);
    b.add(8);
    b.add(9);
    A.add(b);

    System.out.println(A);

    ArrayList<ArrayList<Integer>> d= diagonal(A);
    System.out.println(d);


  }


  public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
    ArrayList<ArrayList<Integer>> b= new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> c= new ArrayList<Integer>();
    for (int j=0;j<A.get(0).size();j++){
      c= new ArrayList<Integer>();
      int l=0;
      for (int k=j;k>=0;k--){
        c.add(A.get(l).get(k));
        l++;
      }
      b.add(c);
    }

    for(int row=1;row<A.get(0).size();row++){
      int col=A.get(0).size()-1;
      int startRow= row;
      c= new ArrayList<Integer>();

      while(startRow<A.get(0).size()){
        c.add(A.get(startRow).get(col));
        col--;
        startRow++;
      }
      b.add(c);
    }

      return b;

  }


}
