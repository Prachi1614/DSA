import java.util.*;

public class topKFrequentElements {

    public static int[] bucketSort(int nums[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if(bucket[freq] == null){
               bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int res[] = new int[k];
        int idx = 0;
        for(int i = bucket.length - 1; i >= 0 && idx < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[idx++] = num;
                    if(idx == k) break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        int res[] = bucketSort(nums, k);
        System.out.println(res[0] + " " + res[1]);
    }
}
