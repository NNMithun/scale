package april3_23_problemSolving4;

public class minimumOfThree {

  public static void main(String[] args) {
    int i=5;
    int j=2;
    int k=3;

    System.out.println(i<j?i<k?i:k:j<k?j:k);

    /*int a=A.get(i)<B.get(j)?
                A.get(i)<C.get(k)?
                      i++:k++
           :B.get(j)<C.get(k)?
                      j++:k++;*/

  }

}
