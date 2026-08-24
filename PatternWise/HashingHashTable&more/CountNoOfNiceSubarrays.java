import java.util.HashMap;

public class CountNoOfNiceSubarrays {

    public static int countSubArrays(int nums[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int ans = 0;
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                sum += nums[i];
            }
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        int k = 2;

        System.out.println(countSubArrays(nums, k));
    }
}
