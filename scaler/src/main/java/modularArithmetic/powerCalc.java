package modularArithmetic;

public class powerCalc {

  public static void main(String[] args) {

    System.out.println(prod(2,4));
  }




  public static int prod(int A,int B){
    int ans=A;

    while(B!=1){
      ans=ans*ans;
      B=B/2;
    }
    return ans;
  }

  /*if(B==0){
      return A;
    }
    int tmp=prod(A,B/2);
    System.out.println(tmp+" "+A+" "+B);
    return tmp*tmp;*/

}
