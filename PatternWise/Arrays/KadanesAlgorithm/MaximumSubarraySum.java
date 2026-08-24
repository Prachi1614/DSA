package KadanesAlgorithm;

public class MaximumSubarraySum {

    public static int kadanes(int nums[]){
       int maxSum = Integer.MIN_VALUE;
       int cs = 0;

       for(int i = 0; i < nums.length; i++){
          cs += nums[i];
          maxSum = Math.max(maxSum, cs);

          if(cs < 0){
            cs = 0;
          }
       }
       return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { -2 , 1 , -3 , 4 , -1 , 2 , 1 , -5 , 4 };
        System.out.println(kadanes(nums));
    }
}
