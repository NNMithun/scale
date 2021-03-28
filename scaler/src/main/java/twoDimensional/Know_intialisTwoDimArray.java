package twoDimensional;

import java.util.ArrayList;

public class Know_intialisTwoDimArray {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    System.out.println(a.size());
    a = new ArrayList<ArrayList<Integer>>(10);
    System.out.println(a.size());
    ArrayList<Integer> b = new ArrayList<Integer>(5);

    System.out.println(b.size());
    for (int i = 0; i < 8; i++) {
      b.add(new Integer(1));
      a.add(b);
    }

    System.out.println(b.size());
    System.out.println(a.size());
   // System.out.println(b);
    System.out.println(a);
  }

  }
