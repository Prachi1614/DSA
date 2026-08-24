import java.util.HashMap;

public class twosumboolean{

    public static boolean isthere(int nums[] , int target){
        HashMap<Integer , Integer> map = new HashMap<>();

        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {2 , 8 , 11 , 15};
        int target = 9;

        System.out.println(isthere(nums, target));
    }
}
