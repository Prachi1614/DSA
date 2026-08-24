import java.util.*;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 500);
        hm.put("Indonesia", 300);
        hm.put("Africa", 690);
        hm.put("China", 30);
        hm.put("Pakistan", 69);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        int maxValue = 0;
        String maxKey = "";
        for (String k : hm.keySet()) {
            if (hm.get(k) > maxValue) {
                maxValue = hm.get(k);
                maxKey = k;
            }
            System.out.println("Key = " + k + ", " + "Value = " + hm.get(k));
        }
        System.out.println(maxKey);
        System.out.println(maxValue);

        // EntrySet

        // for(Map.Entry<String , Integer> entry : name.entryset())

        HashMap<String, Integer> an = new HashMap<>();

        an.put("Aditya", 143);
        an.put("Prachi", 14);
        an.put("Mahi", 2);
        an.put("Aishwarya", 56);

        for (Map.Entry<String, Integer> entry : an.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
