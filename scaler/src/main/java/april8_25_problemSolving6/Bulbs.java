package april8_25_problemSolving6;

import java.util.ArrayList;

public class Bulbs {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList= new ArrayList<>();
    arrayList.add(1);
    arrayList.add(0);
    arrayList.add(0);
    arrayList.add(1);
    arrayList.add(0);
    arrayList.add(0);
    arrayList.add(1);
    arrayList.add(1);
    arrayList.add(0);

    System.out.println(bulbs(arrayList));

  }
  public static int bulbs(ArrayList<Integer> A) {
    int flag=0;
    int i=0;
    int count=0;
    while (i< A.size()){
      if(A.get(i).equals(flag)){
         count++;
         if(A.get(i).equals(0)){
           flag=1;
         }else {
           flag=0;
         }
      }
      i++;

    }
    return count;



  }

}
