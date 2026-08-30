import java.util.*;

public class TopKFrequentElements {

    public static int[] topFreqency(int arr[], int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new ArrayList[arr.length + 1];
        for (int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[key] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int res[] = new int[k];
        int idx = 0;

        for(int i = bucket.length - 1; i >= 0 && idx < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                   res[idx++] = num;

                   if(idx == k){
                    break;
                   }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3 };
        System.out.println(topFreqency(arr, 2));
    }
}
