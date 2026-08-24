import java.util.*;

public class MajorityElementII {

    public static List<Integer> majElementII(int nums[]) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for (Integer k : map.keySet()) {
           if(map.get(k) > nums.length/3){
            res.add(k);
           } 
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majElementII(nums));
    }
}
