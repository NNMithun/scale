package april8_25_problemSolving6;

import java.util.ArrayList;

public class XorQueries {

  public static void main(String[] args) {

    ArrayList<Integer> A= new ArrayList<>();
    A.add(1);
    A.add(0);
    A.add(0);
    A.add(0);
    A.add(1);

    ArrayList<ArrayList<Integer>> B= new ArrayList<>();
    ArrayList<Integer> c= new ArrayList<>();
    c.add(2);
    c.add(4);
    B.add(c);
    c= new ArrayList<>();
    c.add(1);
    c.add(5);
    B.add(c);
    c= new ArrayList<>();
    c.add(3);
    c.add(5);
    B.add(c);

    System.out.println(solve(A,B));



  }
  public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
    ArrayList<ArrayList<Integer>> D= new ArrayList<>();
    ArrayList<Integer> prefixSumArray=prefixSum(A);
    for(int i=0;i<B.size();i++){
      ArrayList<Integer> E= new ArrayList<>();
      ArrayList<Integer> c= B.get(i);
      int initialvalue= c.get(0);
      int finalValue= c.get(1);
      int numberOfOnes=prefixSumArray.get(finalValue)-prefixSumArray.get(initialvalue);
      if(prefixSumArray.get(initialvalue) >prefixSumArray.get(initialvalue-1)){
        numberOfOnes++;
      }
      int numberOfZeros=finalValue-initialvalue+1-numberOfOnes;
      if(numberOfOnes%2==0){
        E.add(0);

      }else {
        E.add(1);
      }
      E.add(numberOfZeros);
      D.add(E);
    }

    return D;



  }

  public static ArrayList<Integer> prefixSum(ArrayList<Integer> A){
    int i=0;
    ArrayList<Integer> B= new ArrayList<>();
    B.add(0);
    int prefixSum=0;
    while (i<A.size()){
      prefixSum+=A.get(i);
      B.add(prefixSum);
      i++;
    }

    return B;
  }


}
