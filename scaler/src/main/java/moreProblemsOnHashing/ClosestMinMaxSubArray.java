package moreProblemsOnHashing;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestMinMaxSubArray {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();

    a.addAll(Arrays.asList(834, 563, 606, 221, 165 ));
    System.out.println(a);

  System.out.println(solve(a));;

  }

  public static int solve(ArrayList<Integer> A) {

    //observation:To get smallest subarray with the min and max elements in it,
    //we should have min and max at end of arrays
    //observation:Keep iterating the array,
    //mark the min and minIndex
    //find the length between min max distance
    //mark the max and maxIndex
    //find the length between min max distance

    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;

    for (int i=0; i<A.size();i++){
      if(A.get(i)<=min){
        min=A.get(i);

      }
      if(A.get(i)>max){
        max=A.get(i);
      }

    }
    System.out.println(min);
    System.out.println(max);

    int minIndex=Integer.MAX_VALUE;
    int maxIndex=Integer.MAX_VALUE;
    boolean minflag=false;
    boolean maxflag=false;
    int dist=Integer.MAX_VALUE;

    for (int i=0; i<A.size();i++){
      if(A.get(i)==min){
        minIndex=i;
        if(maxflag){
          dist= Math.min(dist,minIndex-maxIndex+1);
        }
        minflag=true;

      }

      if(A.get(i)==max){
        maxIndex=i;
        if(minflag){
          dist= Math.min(dist,maxIndex-minIndex+1);
        }
        maxflag= true;

      }

    }

    return dist;


  }

}
