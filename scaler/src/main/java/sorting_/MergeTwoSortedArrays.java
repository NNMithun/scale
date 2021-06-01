package sorting_;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {
    ArrayList<Integer> A= new ArrayList<>();
    ArrayList<Integer> B= new ArrayList<>();

    A.add(1);
    A.add(2);
    A.add(3);
    A.add(4);
    A.add(4);
    A.add(10);
    A.add(11);
    A.add(10);

    B.add(1);
    B.add(2);
    B.add(3);
    B.add(4);
    B.add(5);
    B.add(6);
    B.add(7);
    B.add(8);
    System.out.println(solve(A,B));


  }
  public static ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
    ArrayList<Integer> merged=  new ArrayList();
    int i=0;
    int j=0;

    while(i<A.size() && j<B.size())
    {
      if(A.get(i)<B.get(j))
      {
        merged.add(A.get(i));
        i++;
      }else{
        merged.add(B.get(j));
        j++;
      }
    }
    while(i<A.size())
    {
      merged.add(A.get(i));
      i++;
    }
    while(j<B.size())
    {
      merged.add(B.get(j));
      j++;
    }

    return merged;

  }


}
