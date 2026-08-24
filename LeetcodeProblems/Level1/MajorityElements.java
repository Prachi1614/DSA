import java.util.HashMap;

public class MajorityElements {

    public static int majorityNumber(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int k : map.keySet()) {
            if (map.get(k) > nums.length / 2) {
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 3 , 2 , 3 };
        System.out.println(majorityNumber(nums));
    }
}
