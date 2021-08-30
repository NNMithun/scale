package Maths2;

import java.util.HashMap;

public class DivisorGame {

  public static void main(String[] args) {
    System.out.println(solve(12,2,3));;

  }
  public static int solve(int A, int B, int C) {
    int D=0;
    int E=0;
    int Y=B;
    int Z=C;
    HashMap<Integer,Integer> hm= new HashMap();
    int count=0;
    if(Y<Z){
      Y=Y+Z;
      Z=Y-Z;
      Y=Y-Z;
    }
    while(Y%Z!=0){
      D=Y%Z;
      Y=Z;
      Z=D;
    }

    E=(B*C)/Z;

    int K=E;
    while(K<=A){
      if(!hm.containsKey(K)){
        hm.put(K,1);
        count++;
      }
      K=K*B;
    }

    K=E;
    while(K<=A){
      if(!hm.containsKey(K)){
        hm.put(K,1);
        count++;
      }
      K=K*C;
    }

  return count;

  }
}
