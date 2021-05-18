package problemSolving2_Day21;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class SlidingWindowMax1 {

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(90);
    a.add(767);
    a.add(90);
    a.add(777);
    a.add(463);
    a.add(196);
    a.add(984);
    a.add(277);
    a.add(451);
    a.add(643);
    a.add(403);
    a.add(316);
    a.add(451);
    a.add(967);
    a.add(683);
    a.add(786);
    a.add(167);
    a.add(372);
    a.add(758);
    a.add(402);
    a.add(325);
    a.add(431);
    a.add(351);
    a.add(351);
    a.add(158);
    a.add(663);
    a.add(244);
    a.add(559);
    a.add(345);
    a.add(759);
    a.add(924);
    a.add(585);
    a.add(509);
    a.add(397);
    a.add(540);
    a.add(869);
    a.add(997);
    a.add(670);
    a.add(375);
    a.add(180);
    a.add(48);
    a.add(936);
    a.add(203);
    a.add(8);
    a.add(598);
    a.add(703);
    a.add(733);
    a.add(333);
    a.add(414);
    a.add(377);
    a.add(496);
    a.add(351);
    a.add(910);
    a.add(685);
    a.add(612);
    a.add(773);
    a.add(571);
    a.add(24);
    a.add(679);
    a.add(174);
    a.add(644);
    a.add(639);
    a.add(544);
    a.add(1);
    a.add(884);
    a.add(982);
    a.add(447);
    a.add(670);
    a.add(251);
    a.add(868);
    a.add(815);
    a.add(467);
    a.add(386);
    a.add(932);
    a.add(178);
    a.add(295);
    a.add(957);
    a.add(757);
    a.add(124);
    a.add(932);
    a.add(342);
    a.add(301);
    a.add(406);
    a.add(259);
    a.add(943);
    a.add(79);
    a.add(313);
    a.add(218);
    slidingMaximum(a, 7);
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




        windowSize = windowSize - 1;
        i--;
      }
    }
    arrayList.add(dq.getFirst());
    System.out.println(arrayList);
    return arrayList;
  }

}
