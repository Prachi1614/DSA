import java.util.*;;

public class subarraySumqualsTok {

    public static int sumEquals(int nums[], int k) {
        HashMap <Integer , Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int sum = 0;

        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum , map.getOrDefault(sum , 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1 , 2 , 3 };
        int k = 3;

        System.out.println(sumEquals(nums, k));
    }
}
