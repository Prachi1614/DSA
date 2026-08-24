public class MaxConsequtiveOnes {
    
    public static int maxOnes(int nums[] , int k){
        
        int left = 0;
        int zero_flips = 0;
        int maxlen = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zero_flips++;
            }

            while(zero_flips > k){
                if(nums[left] == 0){
                    zero_flips--;
                }
                left++;
            }
            int maxwin = right - left + 1;
            maxlen = Math.max(maxlen, maxwin);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        System.out.println(maxOnes(nums, k));
    }
}
