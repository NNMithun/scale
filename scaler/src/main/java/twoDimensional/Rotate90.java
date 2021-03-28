package twoDimensional;

import java.util.ArrayList;

public class Rotate90 {

  public static void main(String[] args) {

   /* ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> b= new ArrayList<Integer>();
    b.add(1);
    b.add(2);
    b.add(3);
    b.add(4);
    a.add(b);

    b= new ArrayList<Integer>();
    b.add(5);
    b.add(6);
    b.add(7);
    b.add(8);
    a.add(b);

    b= new ArrayList<Integer>();
    b.add(9);
    b.add(10);
    b.add(11);
    b.add(12);
    a.add(b);

    b= new ArrayList<Integer>();
    b.add(13);
    b.add(14);
    b.add(15);
    b.add(16);
    a.add(b);
*/

    ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> b= new ArrayList<Integer>();
    b.add(1);
    b.add(2);
    a.add(b);



    b= new ArrayList<Integer>();
    b.add(3);
    b.add(4);
    a.add(b);
    solve(a);

  }

  public static void solve(ArrayList<ArrayList<Integer>> A) {

    int length = A.get(0).size();
    System.out.println(A);

    for (int row = 0; row <= length-1/2; row++) {
      for (int col = row+1; col < length; col++) {
        int temp = A.get(row).get(col);
        A.get(row).set(col, A.get(col).get(row));
        A.get(col).set(row, temp);
      }
    }

    for (int col =( length-1)/2+1; col >= length - 1; col--) {
      for (int row = ( length-1)/2+1; row <= length - 2; row++) {
        int temp = A.get(row).get(col);
        A.get(row).set(col, A.get(col).get(row));
        A.get(col).set(row, temp);
      }
    }


    for (int row=0; row<length;row++){
      for (int col=0;col<=(length-1)/2;col++){
        int temp= A.get(row).get(col);
        A.get(row).set(col, A.get(row).get(length-1-col));
        A.get(row).set(length-1-col, temp);
      }
    }




  }

 // public void swap(int)

}
