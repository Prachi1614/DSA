import java.util.HashMap;

public class MajorityElement {

    public static int majElement(int nums[]) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer k : map.keySet()){
            if(map.get(k) > n/2){
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majElement(nums));
    }
}
