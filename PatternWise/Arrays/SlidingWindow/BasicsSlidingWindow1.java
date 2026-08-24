package SlidingWindow;

public class BasicsSlidingWindow1 {
    public static int maxSumSubarray(int nums[] , int k){
        int currSum = 0;
        
        for(int i = 0; i < k; i++){
            currSum += nums[i];
        }

        int maxSum = currSum;
        for(int i = k; i < nums.length; i++){
            currSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {2 , 4 , 5 , 7 , 8 , 9};
        System.out.println(maxSumSubarray(nums, 4));
    }
}
