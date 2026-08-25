import java.util.*;

public class MajorityElememtII {

    public static List<Integer> returnMajorityEl(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       int arr[] = {3 , 2 , 3};
       System.out.println(returnMajorityEl(arr));
    }
}
