import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subArray(int nums[] , int k){
        HashMap <Integer , Integer> map = new HashMap<>();

        map.put(0 , 1);
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
           sum += nums[i];
           if(map.containsKey(sum - k)){
              max += map.get(sum - k);
           }
           map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {10 , 2 , -2 , -20 , 10};
        System.out.println(subArray(nums, -10));
    }
}
