package stringManipulation;

import java.util.ArrayList;

public class AlphaNumeric {

  public static void main(String[] args) {
    ArrayList<Character> a= new ArrayList<>();
    a.add('S');
    a.add('c');
    a.add('a');
    a.add('l');
    a.add('e');
    a.add('r');
    a.add('A');
    a.add('c');
    a.add('a');
    a.add('d');
    a.add('e');
    a.add('m');
    a.add('y');
    a.add('2');
    a.add('0');
    a.add('-');

    System.out.println(solve(a));
  }
  public static int solve(ArrayList<Character> A) {
    for(int i=0;i<A.size();i++){
      if(!((Integer.valueOf(A.get(i))>=97 && Integer.valueOf(A.get(i))<=122) ||
          (Integer.valueOf(A.get(i))>=65 && Integer.valueOf(A.get(i))<=90) ||
          (Integer.valueOf(A.get(i))>=48 && Integer.valueOf(A.get(i))<=57)) ){

          return 0;
      }

    }
    return 1;
  }
}
