import java.util.HashMap;

public class MaximumSumOfDistinctSubarraysOfKL {

  public static long maxSumOfSubarray(int nums[], int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int left = 0;
    int sum = 0;
    int maxsum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

      if (i - left + 1 > k) {
        map.put(nums[left], map.get(nums[left]) - 1);

      if(map.get(nums[left]) == 0){
        map.remove(nums[left]);
      }

      sum -= nums[left];
      left++;

      if(i - left + 1 == k && map.size() == k){
        maxsum = Math.max(maxsum, sum);
      }
    }
  }
    return maxsum;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 5, 4, 2, 9, 9, 9 };
    int k = 3;

    System.out.println(maxSumOfSubarray(nums, k));
  }
}
