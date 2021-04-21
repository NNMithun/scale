package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    HashMap<Integer,ArrayList<Integer>> h= new HashMap<>();
    ArrayList<ArrayList<Integer>> aa= new ArrayList<>();


    for (int i=0;i<A.size();i++){

      int asciiSum= getAsciiSum(A.get(i));
      if (h.containsKey(asciiSum)){
        h.get(asciiSum).add(i+1);
      }else
      {
        ArrayList l= new ArrayList();
        l.add(i+1);
        h.put(asciiSum,l);
      }

    }
    for (ArrayList<Integer> hm: h.values()){

      aa.add(hm);
    }
    return aa;
  }

  private static int getAsciiSum(String a){
    int asciiSum=0;

    for (int i=0; i<a.length();i++){
      asciiSum+=a.charAt(i);

    }
    return asciiSum;

  }

}
