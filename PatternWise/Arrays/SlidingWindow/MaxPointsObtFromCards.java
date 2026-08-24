package SlidingWindow;
public class MaxPointsObtFromCards {

    public static int maxCardPts(int nums[] , int k){
        int lmax = 0;
        int rmax = 0;
        int n = nums.length;

        for(int i = 0; i < k; i++){
            lmax += nums[i];
        }
        int max = lmax;
        int rindex = n - 1;
        for(int i = k - 1; i >= 0; i--){
            lmax -= nums[i];

            rmax += nums[rindex];
            rindex--;

            max = Math.max(lmax + rmax , max);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,1};
        System.out.println(maxCardPts(nums, 3));
    }
}
