package SlidingWindow.VariableSlidingWindow;

public class maxConsecutiveOnes {

    public static int maxcon1s(int nums[] , int k){
        int n = nums.length;
        int zerocnt = 0;
        int left = 0;
        int maxlen = 0;

        for(int right = 0; right < n; right++){
            if(nums[right] == 0){
                zerocnt++;
            }

            while(zerocnt > k){
                if(nums[left] == 0){
                    zerocnt--;
                }
                left++;
            }

            int maxwin = right - left + 1;
            maxlen = Math.max(maxlen, maxwin);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int nums[] = {0 , 0 , 1 , 1 , 0 , 0 , 1 , 1 , 1 , 0 , 1 , 1 , 0 , 0 , 0 , 1 , 1 , 1 , 1};
        int k = 3;
        System.out.println(maxcon1s(nums, k));
    }
    
}