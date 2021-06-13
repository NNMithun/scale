package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheUnsortedArray {

  public static void main(String[] args) {
    //0, 1, 15, 25, 6, 7, 30, 40, 50
    ArrayList<Integer> B= new ArrayList<>();
    B.add(0);
    B.add(1);
    B.add(15);
    B.add(25);
    B.add(6);
    B.add(7);
    B.add(30);
    B.add(40);
    B.add(50);
    System.out.println(solve(B));;


  }
  public static int solve(ArrayList<Integer> A) {

    ArrayList<Integer> B= new ArrayList<>();
    B.addAll(A);

    Collections.sort(A);
    int intialIndex=0;
    int finalIndex=0;


    for(int i=0;i<A.size();i++){
      if(!B.get(i).equals(A.get(i))){
        intialIndex=i;
        break;
      }
    }
    for(int i=A.size()-1;i>=0;i--){
      if(!B.get(i).equals(A.get(i))){
        finalIndex=i;
        break;
      }
    }
    return finalIndex-intialIndex==0?0:finalIndex-intialIndex+1;
  }
}
