package TimeComplexity1D2DArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RainWaterTrapped {

  public static void main(String[] args) {
//  List<Integer> array= Arrays.asList(4, 1, 3);
//  List<Integer> array= Arrays.asList(3, 0, 2, 0, 4);
  List<Integer> array= Arrays.asList(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1);
    System.out.println(trap2(array));;
    System.out.println(trap3(array));;
  }


  //bruteForce
  public static int trap(final List<Integer> A) {
    int leftMax=0;
    int rightMax=0;
    int trappedWater=0;

    for(int i=1; i<A.size()-1;i++){

        for(int j=i-1;j>=0;j--){
           if(A.get(j)>A.get(i)){
             leftMax=Math.max(A.get(j),leftMax);
           }
        }
        for(int j=i+1;j<A.size();j++){
           if(A.get(j)>A.get(i)){
             rightMax=Math.max(A.get(j),rightMax);
           }
        }
        trappedWater+=Math.min(leftMax,rightMax)-A.get(i);
    }

    return trappedWater;

  }
  public static int trap2(final List<Integer> A) {
    int leftMax=0;
    int rightMax=0;
    int trappedWater=0;

    for(int i=1; i<A.size()-1;i++){

         leftMax=A.get(i);
        for(int j=0;j<i;j++){
             leftMax=Math.max(A.get(j),leftMax);

        }

      rightMax=A.get(i);
        for(int j=i+1;j<A.size();j++){
             rightMax=Math.max(A.get(j),rightMax);

        }
        trappedWater+=Math.min(leftMax,rightMax)-A.get(i);
    }

    return trappedWater;

  }

  public static int trap3(final List<Integer> A) {
    List<Integer> prefixMax=new ArrayList<>();
    List<Integer> suffixMax=new ArrayList<>();
    int leftMax=0;
    int rightMax=0;


    int trappedWater=0;

    prefixMax.add(A.get(0));
    suffixMax.add(0);
    for (int i=1;i<A.size();i++){
      prefixMax.add(Math.max(prefixMax.get(i-1),A.get(i)));
      suffixMax.add(0);
    }
    suffixMax.set(A.size()-1,A.get(A.size()-1));
    for (int i=A.size()-2;i>0;i--){
      suffixMax.set(i,Math.max(suffixMax.get(i+1),A.get(i)));
    }

    for(int i=1; i<A.size()-1;i++){

        leftMax=prefixMax.get(i);
        rightMax= suffixMax.get(i);
        trappedWater+=Math.min(leftMax,rightMax)-A.get(i);
    }

    return trappedWater;

  }

}
