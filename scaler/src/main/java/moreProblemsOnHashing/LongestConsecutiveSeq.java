package moreProblemsOnHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LongestConsecutiveSeq {

  public static void main(String[] args) {
    List<Integer> a= new ArrayList<>();
    a.add(97 );
    a.add(86 );
    a.add(67 );
    a.add(19 );
    a.add(107);
    a.add(9  );
    a.add(8  );
    a.add(49 );
    a.add(23 );
    a.add(46 );
    a.add(-4 );
    a.add(22 );
    a.add(72 );
    a.add(4  );
    a.add(57 );
    a.add(111);
    a.add(20 );
    a.add(52 );
    a.add(99 );
    a.add(2  );
    a.add(113);
    a.add(81 );
    a.add(7  );
    a.add(5  );
    a.add(21 );
    a.add(0  );
    a.add(47 );
    a.add(54 );
    a.add(76 );
    a.add(117);
    a.add(-2 );
    a.add(102);
    a.add(34 );
    a.add(12 );
    a.add(103);
    a.add(69 );
    a.add(36 );
    a.add(51 );
    a.add(105);
    a.add(-3 );
    a.add(33 );
    a.add(91 );
    a.add(37 );
    a.add(11 );
    a.add(48 );
    a.add(106);
    a.add(109);
    a.add(45 );
    a.add(58 );
    a.add(77 );
    a.add(104);
    a.add(60 );
    a.add(75 );
    a.add(90 );
    a.add(3  );
    a.add(62 );
    a.add(16 );
    a.add(119);
    a.add(85 );
    a.add(63 );
    a.add(87 );
    a.add(43 );
    a.add(74 );
    a.add(13 );
    a.add(95 );
    a.add(94 );
    a.add(56 );
    a.add(28 );
    a.add(55 );
    a.add(66 );
    a.add(92 );
    a.add(79 );
    a.add(27 );
    a.add(42 );
    a.add(70 );

    System.out.println(longestConsecutive(a));

  }

  public static int longestConsecutive(final List<Integer> A) {
    Collections.sort(A);
    System.out.println(A);
    int max=Integer.MIN_VALUE;
    int count=1;
    for(int i=0;i<A.size()-1;i++){
      if(A.get(i+1)-A.get(i)==1){
        count++;
        if (max<count){
          max=count;
        }
      }else {
        if (A.get(i+1)-A.get(i)!=0){
          count=0;
        }
      }
    }
    return max;
  }
}
