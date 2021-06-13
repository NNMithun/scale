package problemSolving3;

import java.util.ArrayList;
import java.util.LinkedList;

public class constructArray {

  public static void main(String[] args) {
solve(7,39,41);
  }
  public static ArrayList<Integer> solve(final int A, final int B, final int C) {
    //generate all divisors of B-C
    //pick each divisor and shortlist the candidate solutions
    //then pick the minimum of maxima

    ArrayList<Integer> divisors= new ArrayList<>();
    for (int i=1;i<=(C-B);i++){
      if((B-C)%i==0){
        divisors.add(i);
      }
    }

ArrayList<LinkedList<Integer>> validSolns= new ArrayList<>();
    for (int i=0;i<divisors.size();i++){
      int val=C;
      int val2=C;
      LinkedList<Integer> soln= new LinkedList<>();
      soln.add(C);
      for (int j=0;j<A-1;j++){
        val=val-divisors.get(i);
        if(val>0){
          soln.addFirst(val);
        }else {
          val2=val2+divisors.get(i);
          soln.addLast(val2);
        }
      }
      if(soln.getFirst()<=B){
        validSolns.add(soln);
      }
    }

    int minimum_index=0;
    int minimum=Integer.MAX_VALUE;

    for (int i=0;i<validSolns.size();i++){

      if(validSolns.get(i).getLast()<minimum){
        minimum=validSolns.get(i).getLast();
        minimum_index=i;
      }
      if(validSolns.get(i).getLast()==minimum){
        if (validSolns.get(i).get(validSolns.get(i).size()-2)<validSolns.get(minimum_index).get(validSolns.get(minimum_index).size()-2)){
          minimum_index=i;
        }
      }
    }


    ArrayList<Integer> arrayList= new ArrayList<>(validSolns.get(minimum_index));
    System.out.println(arrayList);

return arrayList;
  }

}
