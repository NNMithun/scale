package basicsOfMaths;

import java.util.ArrayList;

public class InplaceRearrangeArray {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add(2);
    a.add(3);
    a.add(0);
    a.add(1);
    arrange(a);

  }
  public static void arrange(ArrayList<Integer> a) {

    //multiple with length
    int n=a.size();

    for (int i=0;i<a.size();i++){
      a.set(i,a.get(i)*n);
    }
    for (int i=0;i<a.size();i++){
      a.set(i,a.get(i)+a.get(a.get(i)/n)/n);
    }
    for (int i=0;i<a.size();i++){
      a.set(i,a.get(i)%n);
      System.out.println(a.get(i));
    }

      }

}
