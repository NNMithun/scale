package basicMaths2;

import java.util.ArrayList;
import java.util.HashMap;

public class PairSumDivisibleByM {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList= new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    System.out.println(solve(arrayList,2));;

  }
  public static int solve(ArrayList<Integer> A, int B) {
    HashMap<Integer,Integer> hashMap= new HashMap();
    int count=0;

    for(int i=0;i<A.size();i++){
      A.set(i,(A.get(i)%B));
    }

    for(int i=0;i<A.size();i++){
     if(hashMap.containsKey(B-A.get(i))){
      count+=hashMap.get(B-A.get(i));
     }
     else {
       if(A.get(i)==0){
         if(hashMap.containsKey(0)){
           count+=hashMap.get(0);
         }
       }
       if(hashMap.containsKey(A.get(i))){
         hashMap.put(A.get(i),hashMap.get(A.get(i))+1);

       }else{
         hashMap.put(A.get(i),1);
       }

     }
    }

    return count;



  }

}
