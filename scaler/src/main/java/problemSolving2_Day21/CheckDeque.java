package problemSolving2_Day21;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class CheckDeque {

  public static void main(String[] args) {
    Deque<Integer> dq= new ArrayDeque<>();
    dq.add(1);
    dq.add(2);
    dq.add(3);
    dq.add(4);
    dq.add(4);
    dq.add(4);
    dq.add(5);
    dq.add(6);
    dq.add(7);
    dq.add(8);


    System.out.println(dq);
  }

}
