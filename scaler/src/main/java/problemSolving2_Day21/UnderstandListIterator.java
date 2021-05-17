package problemSolving2_Day21;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UnderstandListIterator {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add(1);
    a.add(11);
    a.add(12);
    a.add(13);
    System.out.println(majorityElement(a));

  }

  public static int majorityElement(final List<Integer> A) {
    ListIterator iterator= A.listIterator();
    int old= (int) iterator.next();
    while (iterator.hasNext()){
      int next =(int) iterator.next();
      if(old!=next){
        iterator.remove();
        iterator.previous();
        iterator.remove();
      }

    }
    return 2;
  }


}
