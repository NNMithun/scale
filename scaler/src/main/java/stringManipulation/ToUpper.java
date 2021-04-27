package stringManipulation;

import java.util.ArrayList;

public class ToUpper {

  public static void main(String[] args) {

    ArrayList<Character> a= new ArrayList<>();
    a.add('A');
    a.add('B');
    a.add('a');
    a.add('c');
    System.out.println(    to_Upper(a));
  }
  public static ArrayList<Character> to_Upper(ArrayList<Character> A) {
    for(int i=0;i<A.size();i++){
      if(Integer.valueOf(A.get(i))>=97 && Integer.valueOf(A.get(i))<=122){

        int asciiValue=Integer.valueOf(A.get(i))-32;
        char asciChar=(char)asciiValue;
        A.set(i,asciChar);
      }

    }
    return A;
  }

}
