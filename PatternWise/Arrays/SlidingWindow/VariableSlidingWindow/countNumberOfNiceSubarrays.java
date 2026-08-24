package SlidingWindow.VariableSlidingWindow;

public class countNumberOfNiceSubarrays {

    public static int niceSubarray(int nums[] , int k){
        return atMost(nums , k) - atMost(nums , k - 1);
    }

    private static int atMost(int nums[] , int k){
        int n = nums.length;
        int count = 0;
        int oddcount = 0;
        int left = 0;
        
        for(int right = 0; right < n; right++){
            if(nums[right] % 2 == 1){
                oddcount++;
            }

            while(oddcount > k){
                if(nums[left] % 2 == 1){
                    oddcount--;
                }
                left++;
            }

            count += right - left + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {2 , 1 , 2 , 1 , 2};
        int k = 1;
        System.out.println(niceSubarray(nums, k));
    }
}
