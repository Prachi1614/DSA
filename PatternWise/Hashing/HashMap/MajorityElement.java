import java.util.*;
public class MajorityElement {

    public static List<Integer> FindMajority(int nums[]){
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        HashMap <Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0)+1);
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3){
                result.add(entry.getKey());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1 , 3 , 2 , 3 , 1 , 3 , 1 , 3 , 1};
        System.out.println(FindMajority(nums));
    }
}
