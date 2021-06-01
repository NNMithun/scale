package sorting;

import java.util.ArrayList;

public class PickfromBothSides {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add(5);
    a.add(-2);
    a.add(3);
    a.add(1);
    a.add(2);

    System.out.println(solve(a,3));;

  }
  public static int solve(ArrayList<Integer> A, int B){
    int sum=0;
    for(int i=0;i<B;i++){

      sum+=A.get(i);
    }

    int maxSum=sum;
    for(int i=B-1;i>=0;i--){
      sum=sum-A.get(i)+A.get(A.size()-1-(B-1-i));
      if(sum>maxSum){
        maxSum=sum;
      }

    }
    return maxSum;
  }
}
