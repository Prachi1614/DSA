import java.util.HashMap;

public class FruitsIntoBaskets {

    public static int numberOfFruits(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > 2) {
                if (map.get(nums[left]) == 1) {
                    map.remove(nums[left]);
                } else {
                    map.put(nums[left], map.get(nums[left]) - 1);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 2, 2 };
        System.out.println(numberOfFruits(nums));
    }
}
