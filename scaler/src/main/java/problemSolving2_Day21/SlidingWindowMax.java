package problemSolving2_Day21;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class SlidingWindowMax {

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add( 268);
    a.add( 202);
    a.add( 139);
    a.add( 744);
    a.add( 502);
    a.add( 582);
    a.add( 94);
    a.add( 81);
    a.add( 117);
    a.add( 258);
    a.add( 506);
    a.add( 461);
    a.add( 531);
    a.add( 768);
    a.add( 827);
    a.add( 128);
    a.add( 592);
    a.add( 571);
    a.add( 559);
    a.add( 374);
    a.add( 910);
    a.add( 610);
    a.add( 561);
    a.add( 489);
    a.add( 647);
    a.add( 246);
    a.add( 355);
    a.add( 313);
    a.add( 158);
    a.add( 922);
    a.add( 557);
    a.add( 36);
    a.add( 430);
    a.add( 983);
    a.add( 913);
    a.add( 303);
    a.add( 765);
    a.add( 945);
    a.add( 167);
    a.add( 340);
    a.add( 869);
    a.add( 869);
    a.add( 609);
    a.add( 809);
    a.add( 529);
    a.add( 715);
    a.add( 34);
    a.add( 13);
    a.add( 657);
    a.add( 407);
    a.add( 684);
    a.add( 801);
    a.add( 129);
    a.add( 952);
    a.add( 159);
    a.add( 250);
    a.add( 546);
    a.add( 508);
    a.add( 540);
    a.add( 948);
    a.add( 429);
    a.add( 174 );
    slidingMaximum(a, 6);
  }

  public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
    Deque<Integer> dq = new ArrayDeque<>();
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> removeElements = new ArrayList<>();
    int windowSize = 1;
    dq.add(A.get(0));
    for (int i = 1; i < A.size(); i++) {

      if (windowSize < B) {
        dq.add(A.get(i));
        Iterator itr = dq.iterator();
        removeElements = new ArrayList<>();

        while (itr.hasNext()) {
          Integer tmp = (Integer) itr.next();
          if (tmp < A.get(i)) {
            removeElements.add(tmp);
          }
        }
        for (int j = 0; j < removeElements.size(); j++) {
          dq.remove(removeElements.get(j));
        }
        windowSize++;
      } else {
        arrayList.add(dq.getFirst());
        if (dq.contains(A.get(i - B))) {
          int tmpwindow = B - 1;
          boolean flag = true;
          while (tmpwindow >= 0) {
            if (A.get(i - B).equals(A.get(i - tmpwindow))) {
              flag = false;
              break;
            }
            tmpwindow--;
          }
          if (flag) {
            while (dq.contains(A.get(i - B)))
              dq.remove(A.get(i - B));
          }

        }
        windowSize = windowSize - 1;
        i--;
      }
    }
    arrayList.add(dq.getFirst());
    System.out.println(arrayList);
    return arrayList;
  }

}
