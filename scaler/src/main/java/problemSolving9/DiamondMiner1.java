package problemSolving9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiamondMiner1 {

  public static void main(String[] args) {

   /* List<Integer> B= Arrays.asList(0,1,-1,0,2,-3,4);
    List<Integer> C= Arrays.asList(0,1,-1,0,2,-3,4);
*/
    List<Integer> B= Arrays.asList(0,1);
    List<Integer> C= Arrays.asList(1,0);

    //solve(B,C);
  }

  public static int solve(int A,ArrayList<Integer> B, ArrayList<Integer> C) {
    B=arrayModification(B);
    C=arrayModification(C);
    int sum=0;

    for (int i=0;i<B.size();i++){
     sum+= Math.sqrt((B.get(i)*B.get(i))+(C.get(i)*C.get(i)));
    }

    System.out.println(sum);

    return 0;
  }

  public static ArrayList<Integer> arrayModification(ArrayList<Integer> B){
    int numberOfZeros=0;
    Collections.sort(B);
    for(int i=0;i<B.size();i++){
      if (B.get(i)<0){
        B.set(i,B.get(i)*-1);
      }
      if(B.get(i)==0){
        numberOfZeros++;
      }
    }
    Collections.sort(B);
    ArrayList<Integer> C= new ArrayList<>(B.subList(numberOfZeros,B.size()));

    return C;
  }

  /*public static int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
    Collections.sort(B);
    for(int i=0;i<B.size();i++){
      if(B.get(i).equals(0)){
        B.remove(i);
      }
      if (B.get(i)<0){
        B.set(i,B.get(i)*-1);
      }
    }

    return 0;
  }
*/
}
