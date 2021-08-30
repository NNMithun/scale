package April30_Day33_ArraysMaths;

import java.util.ArrayList;

public class SumOfAllSubmatrices {

  public static void main(String[] args) {

  }
  public int solve(ArrayList<ArrayList<Integer>> A) {
    int N=A.size();
    int sum=0;
    for (int i=0;i<A.size();i++){
      for (int j=0;j<A.get(i).size();j++){
        sum+=A.get(i).get(j)* (i+1)*(j+1)*(N-i)*(N-j);
      }
    }
    return sum;
  }

}
