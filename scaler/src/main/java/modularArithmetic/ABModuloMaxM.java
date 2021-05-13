package modularArithmetic;

public class ABModuloMaxM {

  public static void main(String[] args) {

    System.out.println(solve(6816621,8157697));
    System.out.println(6816621%1341076);
    System.out.println(8157697%1341076);
    System.out.println(8157697-6816621);
    //answer
    System.out.println(Math.abs(6816621-8157697));;
  }

  public static int solve(int A, int B) {
    if(A%B==0){
      return B;
    }
     return solve(B,A%B);
  }

}
