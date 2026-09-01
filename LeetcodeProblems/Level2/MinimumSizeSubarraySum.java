public class MinimumSizeSubarraySum {

    public static int minLength(int nums[], int target) {
        int right = 0;
        int left = 0;
        int length = Integer.MAX_VALUE;
        int currSum = 0;

        while (right < nums.length) {
            currSum += nums[right];
            right++;

            while (currSum >= target) {
                int window = right - left;
                length = Math.min(length, window);

                currSum -= nums[left];
                left++;
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1 , 1 , 1 , 1 , 1 };
        System.out.println(minLength(nums, 11));
    }
}
