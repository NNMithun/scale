package modularArithmetic;

public class PrimeModuloInverse {

  public static void main(String[] args) {
    System.out.println(solve(8,17));
  }

  public static int solve(int A, int B) {
    return (int)(pow(A,B-2, B)%B);



  }

  public static long pow(long A, long B, long mod){


    if(B==0) return 1;
    long tmp=pow(A,B/2, mod);
    long res=(tmp*tmp)%mod;
    if(B%2==1)res*=A;
    return res%(mod);

  }




}
