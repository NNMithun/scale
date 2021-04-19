package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class commonelements {

  public static void main(String[] args) {

  }
  public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

    HashMap<Integer,Integer> h= new HashMap<>();
    ArrayList<Integer> c= new ArrayList<>();
    for (int a:
   A ) {
      if (h.containsKey(a)){
        h.put(a,h.get(a)+1);
      }else
      {
        h.put(a,1);
      }
    }

    for (int b:B){

      if(h.containsKey(b) && 0!=h.get(b) ){
        c.add(b);
        h.put(b,h.get(b)-1);
      }
    }

    return c;
  }

}
