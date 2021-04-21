package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class anagrams2 {

  public static void main(String[] args) {
    ArrayList<String> anal= new ArrayList<>();
    anal.add("cde");
    anal.add("bee");

    System.out.println(anagrams(anal));


  }


  public static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    HashMap<Integer,ArrayList<Integer>> h= new HashMap<>();
    ArrayList<ArrayList<Integer>> aa= new ArrayList<>();

    for (int i=0; i<A.size();i++){
    }


    return  aa;

  }
  private static int getAsciiSum(String a){
    int asciiSum=0;

    for (int i=0; i<a.length();i++){
      asciiSum+=a.charAt(i);

    }
    return asciiSum;

  }

}
