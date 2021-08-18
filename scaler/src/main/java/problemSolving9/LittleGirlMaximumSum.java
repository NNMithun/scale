package problemSolving9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LittleGirlMaximumSum {

  public static void main(String[] args) {
    List<Integer> arrayList= Arrays.asList(5,3,2);
    List<Integer> list1= Arrays.asList(1,2);
    List<Integer> list2= Arrays.asList(2,3);
    List<Integer> list3= Arrays.asList(1,3);
    List<List<Integer>>  list= new ArrayList<>();
    list.add(list1);
    list.add(list2);
    list.add(list3);
    System.out.println(    solve(arrayList,list));
  }

  public static int solve(List<Integer> A, List<List<Integer>> B) {
    Collections.sort(A);
    ArrayList<Integer> freqArray= new ArrayList<>();
    for (int i=0;i<=A.size();i++){
      freqArray.add(0);
    }
    for (int i=0;i<B.size();i++){
      freqArray.set(B.get(i).get(0)-1,freqArray.get(B.get(i).get(0)-1)+1);
      freqArray.set(B.get(i).get(1),freqArray.get(B.get(i).get(1))-1);
    }
    int val=0;
    for (int i=0;i<freqArray.size();i++){
       val=val+freqArray.get(i);
      freqArray.set(i,val);
    }
    Collections.sort(freqArray);

    int sum=0;
    for (int i=0;i<A.size();i++){
      sum+=freqArray.get(i+1)*A.get(i);
      sum=sum%(int)(Math.pow(10,9)+7);
    }
    return sum ;



  }

}
