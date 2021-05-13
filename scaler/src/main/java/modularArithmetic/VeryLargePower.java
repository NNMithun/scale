package modularArithmetic;

public class VeryLargePower {

  public static void main(String[] args) {
    System.out.println(solve(2,27));
  }

  public static int solve(int A, int B) {
    int mod=(int)(Math.pow(10,9)+7);
    long C=fact(B, mod)%(mod-1);
    int D=(int)pow(A,(int) C,mod);

    return D;


  }

  public static long fact(int B, int mod){
    long ans=1;
    while(B!=1){
      ans=(ans*B)%(mod-1);
      B--;
    }
    return ans;
  }
  public static long pow(int A,int B, int mod){
    if(B==0) return 1;
    long tmp=pow(A,B/2, mod);
    long res=(tmp*tmp)%mod;
    if(B%2==1)res*=A;
    return res%(mod);
  }
}
