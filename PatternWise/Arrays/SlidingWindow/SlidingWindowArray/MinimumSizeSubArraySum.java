public class MinimumSizeSubArraySum {

    public static int minSizeSubarray(int nums[], int target) {
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int currsum = 0;

        while (right < nums.length) {
            currsum += nums[right];
            right++;

            while (currsum >= target) {
                int windowsize = right - left;
                min = Math.min(windowsize, min);

                currsum -= nums[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        int target = 7;

        System.out.println(minSizeSubarray(nums, target));
    }
}
