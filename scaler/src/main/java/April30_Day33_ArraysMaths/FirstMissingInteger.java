package April30_Day33_ArraysMaths;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstMissingInteger {

  public static void main(String[] args) {
    List<Integer> a = Arrays
        .asList(894, 669, 852, 722, 778, 169, 247, 927, 875, 858, 396, 760, 318, 409, 640, 976, 419, 600, 711, 610, 864, 655, 859, 567, 7, 487, 953, 632, 544, 158, 53, 919, 45, 699, 493, 414, 586, 460, 339, 540, 12, 948, 515, 16, 116, 772, 529, 606, 684, 214, 724, 811, 925, 703, 454, 592, 330, 143, 41, 401, 570, 326, 885, 943, 836, 252, 119, 773, 768, 447, 581, 237, 380, 182, 457, 868, 667, 109, 702, 692, 542, 517, 966, 583, 983, 273, 641, 691, 985, 115, 574, 216, 372, 298, 411, 784, 95, 251, 389, 354, 964, 430, 991, 799, 824, 826, 714, 238, 967, 977, 291, 545, 355, 287, 425, 305, 118, 902, 479, 388, 19, 61, 301, 782, 688, 893, 673, 195, 971, 693, 797, 996, 3, 314, 353, 103, 391, 905, 316, 734, 54, 939, 648, 526, 448, 255, 690, 114, 715, 148, 376, 878, 483, 408, 804, 585, 79, 644, 621, 221, 345);
    System.out.println(firstMissingPositive(a));

  }

  //brute force
  public static int firstMissingPositive(List<Integer> A) {
    Collections.sort(A);

    for (int i = 0; i < A.size() - 1; i++) {
      if (A.get(i) > 0 && i>0 && A.get(i-1)<=0){
        if(A.get(i)!=1){
          return 1;
        }
      }

      if (A.get(i) > 0) {
        if(A.get(i)!=A.get(i+1)){
          if(i==0 && A.get(i)!=1){
            return 1;
          } else if(!A.get(i).equals(A.get(i+1)-1)) {
          return A.get(i)+1;
        }
      }
      }
    }
    if (A.get(A.size() - 1) > 0) {
      return A.get(A.size() - 1) + 1;
    } else {
      return 1;
    }


  }

}


