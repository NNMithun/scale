package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class NobleInteger {

  public static void main(String[] args) {
    ArrayList<Integer> A= new ArrayList();
    A.add(-1);
    A.add(-2);
    A.add(0);
    A.add(0);
    A.add(0);
    A.add(-3);



    System.out.println(solve(A));;


  }
  public static int solve(ArrayList<Integer> A) {
    Collections.sort(A);
    System.out.println(A);




    for (int i=0; i<=A.size()-2;i++){
      if(A.get(i)==A.size()-1-i  && A.get(i)!=A.get(i+1)){
        return 1;
      }
    }
    if(A.get(A.size()-1)==0){
      return 1;
    }
    return -1;
  }

}
