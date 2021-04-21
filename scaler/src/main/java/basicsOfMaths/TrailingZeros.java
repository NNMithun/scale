package basicsOfMaths;

public class TrailingZeros {

  public static void main(String[] args) {
    int trailingZeros=trailingZeroes(9247);
    System.out.println(trailingZeros);

  }


  public  static int trailingZeroes(int A) {

    int count=0;
    int x=5;

    while (x<=A){
      count+=A/x;
      x*=5;
    }

    System.out.println(x);
    return count;
  }
}
