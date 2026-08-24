import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] addTwo(int arr[] , int target){
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target - arr[i])){
                return new int[]{map.get(target - arr[i]) , i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1 , -1};
    }
    public static void main(String[] args) {
        int arr[] = {2 , 7 , 11 , 15};

        int res[] = addTwo(arr, 9);
        System.out.println(Arrays.toString(res));
    }
}
