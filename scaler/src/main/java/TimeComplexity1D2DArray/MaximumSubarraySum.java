package TimeComplexity1D2DArray;

import java.util.List;

public class MaximumSubarraySum {

  public static void main(String[] args) {
   int a=Integer.MIN_VALUE;

  }

  public int maxSubArray(final List<Integer> A) {
    int sum = 0, ans = 0;
    for (int i = 0; i < A.size(); i++) {
      if (sum > 0) {
        sum += A.get(i);
      } else {
        sum = 0;
      }
      ans = Math.max(ans, sum);
    }
    return ans;
  }

}
