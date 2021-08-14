package problemSolving8;

import java.util.ArrayList;

public class AntFall {

  public static void main(String[] args) {

  }
  public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
    int max1=Integer.MIN_VALUE;
    int max2=Integer.MIN_VALUE;
    if (B.size()>0){
      max1=B.stream().max(Integer::compare).get();
    }
    if (C.size()>0){
      for (int i=0;i<C.size();i++){
        int val=A-C.get(i);
        if(max2<val){
          max2=val;
        }

      }

    }

    if (max1>max2)return max1;
    else return max2;

  }

}
