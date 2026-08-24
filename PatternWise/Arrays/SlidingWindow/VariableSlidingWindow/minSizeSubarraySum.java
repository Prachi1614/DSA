package SlidingWindow.VariableSlidingWindow;

public class minSizeSubarraySum {
        public static int minSizeSum(int nums[] , int target){
        int minlength = Integer.MAX_VALUE;
        int n = nums.length; 
        int high = 0;
        int low = 0;
        int currsum = 0;
        while(high < n){
           currsum += nums[high];
           high++;

           while(currsum >= target){
            int windowmin = high - low;
            minlength = Math.min(minlength, windowmin);

            currsum -= nums[low];
            low++;
           }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        System.out.println(minSizeSum(nums, 7));
    }
}
