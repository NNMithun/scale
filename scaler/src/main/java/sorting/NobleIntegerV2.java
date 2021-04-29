package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class NobleIntegerV2 {

  public static void main(String[] args) {
    ArrayList<Integer> A= new ArrayList();
    A.add(1);
    A.add(2);
    A.add(7);
    A.add(0);
    A.add(9);
    A.add(3);
    A.add(6);
    A.add(0);
    A.add(6);


    System.out.println(solve(A));;


  }
  public static int solve(ArrayList<Integer> A) {
    Collections.sort(A);
    System.out.println(A);

    Iterator itr= A.iterator();

    Integer old = (Integer) itr.next();
    while(itr.hasNext())
    {
      Integer next =(Integer) itr.next();
      if(old.equals(next))
      {
        itr.remove();
      }
      old = next;
    }
    System.out.println(A);


    for (int i=0; i<=A.size()-2;i++){
      if(Math.abs(A.get(i))==A.size()-1-i){
        return 1;
      }else if(A.get(i)>A.size()-1-i){
        return -1;
      }
    }
    return -1;
  }


}
