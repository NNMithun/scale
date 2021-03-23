package week3;

import java.util.ArrayList;

public class RowWithMaxOnes {
//brute force
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> r=  new ArrayList<ArrayList<Integer>>();

    ArrayList<Integer> col= new ArrayList<Integer>();
    col.add(0);
    col.add(0);
    col.add(1);
    col.add(1);
    col.add(1);

    r.add(col);
    col= new ArrayList<Integer>();
    col.add(0);
    col.add(0);
    col.add(0);
    col.add(1);
    col.add(1);


    r.add(col);
    col= new ArrayList<Integer>();
    col.add(0);
    col.add(0);
    col.add(0);
    col.add(1);
    col.add(1);

    r.add(col);

    col= new ArrayList<Integer>();
    col.add(0);
    col.add(0);
    col.add(0);
    col.add(0);
    col.add(1);

    r.add(col);

    col= new ArrayList<Integer>();
    col.add(0);
    col.add(0);
    col.add(0);
    col.add(1);
    col.add(1);

    r.add(col);




    System.out.println(solve(r));

  }

  public static int solve(ArrayList<ArrayList<Integer>> A) {
    int max=Integer.MIN_VALUE;
    int maxRow=0;

    for (int i=0; i<A.size();i++){
      for (int j=0; j<A.get(i).size();j++){
        if(A.get(i).get(j)==1){
          if(max<A.get(i).size()-j){
            max=A.get(i).size()-j;
            maxRow=i;
          }
        }
      }
    }

    return maxRow;

  }



}
