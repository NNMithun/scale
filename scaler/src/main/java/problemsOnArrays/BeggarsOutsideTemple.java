package problemsOnArrays;

import java.util.ArrayList;

public class BeggarsOutsideTemple {

  public static void main(String[] args) {
//[[1, 2, 10], [2, 3, 20], [2, 5, 25]]
    ArrayList<ArrayList<Integer>> B= new ArrayList<>();
    ArrayList<Integer> c= new ArrayList<>();
    c.add(1);
    c.add(2);
    c.add(10);
    B.add(c);
    c= new ArrayList<>();
    c.add(2);
    c.add(3);
    c.add(20);
    B.add(c);
    c= new ArrayList<>();
    c.add(2);
    c.add(5);
    c.add(25);
    B.add(c);


    solve(5,B);
  }
  public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

    int[] beggers= new int[A+1];

    for (ArrayList<Integer> devotee: B) {
      beggers[devotee.get(0)-1]=beggers[devotee.get(0)-1]+devotee.get(2);
      beggers[devotee.get(1)]=beggers[devotee.get(1)]-devotee.get(2);
      }

    int[] prefixSum= new int[A+1];
    int sum=0;
    prefixSum[0]=0;


    for(int i=0;i<A;i++){
      sum=sum+beggers[i];
      prefixSum[i+1]=sum;
    }


    ArrayList<Integer> ans= new ArrayList<>();
    for(int i=1;i<=A;i++){
      ans.add(prefixSum[i]);
    }

    return ans;
  }
}
