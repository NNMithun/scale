package backtracking;

import java.util.Scanner;

public class Permutations {

  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    String str= scanner.next();
    findPermutations(str,0,str.length()-1);
  }

  private static void findPermutations(String str, int left, int right) {
    if(left==right){
      System.out.println(str);
    }else {
    for(int i=left;i<=right;i++){
      //do
      str=swap(str,left,i);
      //recur
      findPermutations(str,left+1, right);
      //undo
      str=swap(str,left,i);
    }
    }
  }

  private static String swap(String str, int left, int i) {
    char t;
    char[] charLs= str.toCharArray();
    t=charLs[left];
    charLs[left]=charLs[i];
    charLs[i]=t;
    return String.valueOf(charLs);
  }
}
