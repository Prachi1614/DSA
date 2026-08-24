package SlidingWindow;

public class MaxSumDistinctSubarraysLenK {

    public static long distinctSubarray(int nums[] , int k){
        int freq[] = new int[10001];
        int n = nums.length;
        long sum = 0, max = 0; 
        int left = 0;
        int distinct = 0;

        for(int i = 0; i < n; i++){

            if(freq[nums[i]] == 0){
                distinct++;
                freq[nums[i]]++;
                sum += nums[i];
            }

            if(i - left + 1 > k){
                freq[nums[left]]--;
                if(freq[nums[left]] == 0){
                    distinct--;
                sum -= nums[left];
                left++;
                }
            }
            if(i - left + 1 == k && distinct == k){
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {9,9,9};
        System.out.println(distinctSubarray(nums, 3));
    } 
}
