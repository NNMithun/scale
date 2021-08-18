package problemSolving9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MaximumPath {

  public static void main(String[] args) {
    List<Integer> list1= Arrays.asList(2, 3, 7, 10, 12);
    List<Integer> list2= Arrays.asList(1, 5, 7, 8);
    System.out.println(solve(list1,list2));


  }
  public static int solve(List<Integer> A, List<Integer> B) {
    int sum1=0;
    int sum2=0;
    int ans=0;
    int i=0;
    int j=0;

    while(i<A.size() || j<B.size()){

      if(j==B.size()){
        sum1+=A.get(i);
        if(i<A.size())i++;
      }else if(i==A.size()){
        sum2+=B.get(j);
        if(j<B.size())j++;
      }else if(A.get(i)<B.get(j)){
          sum1+=A.get(i);
          if(i<A.size())i++;
        }else if(A.get(i)>B.get(j)){
          sum2+=B.get(j);
          if(j<B.size())j++;
        }else{
          if(sum1>sum2){
            ans+=sum1;
            ans+=A.get(i);
          }else{
            ans+=sum2;
            ans+=A.get(i);
          }
          sum1=0;sum2=0;
          if(i<A.size())i++;
          if(j<B.size())j++;

        }


    }

    if(sum1>sum2){
      ans+=sum1;
    }else {
      ans+=sum2;
    }



    return ans;
  }
}
