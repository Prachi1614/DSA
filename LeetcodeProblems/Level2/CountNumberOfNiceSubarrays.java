public class CountNumberOfNiceSubarrays {
    public static int countNice(int nums[], int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static int atMost(int nums[], int k) {
        int left = 0;
        int right = 0;
        int oddcount = 0;
        int count = 0;

        while (right < nums.length) {
            if (nums[right] % 2 == 1) {
                oddcount++;
            }
            right++;

            while (oddcount > k) {
                if (nums[left] % 2 == 1) {
                    oddcount--;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        System.out.println(countNice(nums, 2));
    }
}
