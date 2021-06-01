package sorting;

import java.util.ArrayList;

public class SelectionSort {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add(6);
    a.add(4);
    a.add(3);
    a.add(7);
    a.add(2);
    a.add(8);
    System.out.println(solve(a));


  }
  public static ArrayList<Integer> solve(ArrayList<Integer> A) {
    ArrayList<Integer> minIndexArray= new ArrayList<>();

    for (int i=0;i<A.size()-1;i++){
      int minIndex=i;
      for (int j=i+1;j<A.size();j++){
        if (A.get(j)<A.get(minIndex)){
          minIndex=j;
        }
      }

      minIndexArray.add(minIndex);
      int tmp=A.get(i);
      A.set(i,A.get(minIndex));
      A.set(minIndex,tmp);

    }
    return minIndexArray;
  }

}
