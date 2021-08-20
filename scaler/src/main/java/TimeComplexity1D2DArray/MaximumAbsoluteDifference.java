package TimeComplexity1D2DArray;

import java.util.Arrays;
import java.util.List;

public class MaximumAbsoluteDifference {

  public static void main(String[] args) {
    List<Integer> arrays= Arrays.asList(1,3,-1);
    System.out.println(maxAbsoluteDifference(arrays));
    //System.out.println(maxAbsoluteDifferenceBruteForce(arrays));


  }

  //brute force
  public static int maxAbsoluteDifferenceBruteForce(List<Integer> array){
    int max=Integer.MIN_VALUE;
    for (int i=0;i<array.size();i++){
      for (int j=i+1;j<array.size();j++){
        int val=Math.abs(array.get(i)-array.get(j))+Math.abs(i-j);
        if(max<val){
          max=val;
        }

      }
    }
    return max;

  }
  public static int maxAbsoluteDifference(List<Integer> A){
    int max1=Integer.MIN_VALUE;
    int max2=Integer.MIN_VALUE;
    int min1=Integer.MAX_VALUE;
    int min2=Integer.MAX_VALUE;

    for (int i=0;i<A.size();i++){
      max1=Math.max(A.get(i)+i,max1);
      min1=Math.min(A.get(i)+i,min1);

      max2=Math.max(A.get(i)-i,max2);
      min2=Math.min(A.get(i)-i,min2);

    }

    return Math.max(max1-min1,max2-min2);

  }

}
