package stringManipulation;

import java.util.ArrayList;

public class ToLower {

  public static void main(String[] args) {
    ArrayList<Character> a= new ArrayList<>();
    a.add('A');
    a.add('B');
    a.add('a');
    a.add('c');
    to_lower(a);
  }
  public static ArrayList<Character> to_lower(ArrayList<Character> A) {
    for(int i=0;i<A.size();i++){
      if(Integer.valueOf(A.get(i))>=65 && Integer.valueOf(A.get(i))<=90){

          int asciiValue=Integer.valueOf(A.get(i))+32;
          char asciChar=(char)asciiValue;
          A.set(i,asciChar);
      }

    }
    return A;
  }
}
