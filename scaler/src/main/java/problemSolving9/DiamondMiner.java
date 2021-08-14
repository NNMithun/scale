package problemSolving9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiamondMiner {

  public static void main(String[] args) {

   /* List<Integer> B= Arrays.asList(0,1,-1,0,2,-3,4);
    List<Integer> C= Arrays.asList(0,1,-1,0,2,-3,4);
*/
    List<Integer> B= Arrays.asList( -4, 10, -11, -4, -15, 16, 8, 13, 15, -13, 10, 12, -1, 11, -11, -14, 15, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    System.out.println(B);
    List<Integer> C= Arrays.asList( 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 10, 15, 11, 13, 14, 14, 10, 15, 13, 15, 15, 12, 15, 14, 12, 15, 14);
    System.out.println(C);

    solve(B,C);
  }

  public static int solve(List<Integer> B, List<Integer> C) {
    System.out.println("B size ="+B.size());
    B=arrayModification(B);
    System.out.println("B=  "+B);

    System.out.println("C size ="+B.size());
    C=arrayModification(C);
    System.out.println("C=  "+C);

    double sum=0;

    for (int i=0;i<B.size();i++){
     sum+= Math.sqrt((B.get(i)*B.get(i))+(C.get(i)*C.get(i)));
    }

    System.out.println(sum);

    return (int)sum;
  }

  public static List<Integer> arrayModification(List<Integer> B){
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
    System.out.println("numberOfZeros ="+numberOfZeros);
    Collections.sort(B);
    System.out.println(B);
    List<Integer> C=B.subList(numberOfZeros,B.size());

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
