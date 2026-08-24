public class MaxAvgSubArrayI {

    public static double maxAVG(int nums[] , int k ){

      int max = 0;
      int left = 0;
      int right = 0;
      int sum = 0;

      while(right < nums.length){
        sum += nums[right];
        right++;

        int windowsize = right - left;
        
        if(windowsize == k){
          max = Math.max(max, sum);

          sum -= nums[left];
          left++;
        }
      }
      return (double) max / k;
    }
    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(maxAVG(nums, k));
    }
}
