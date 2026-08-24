import java.util.*;
public class HashmapOperations {
    public static void main(String[] args) {
        HashMap <String , Integer> hm = new HashMap<>();
        
        //Put operation is used for adding keys and values to something.

        hm.put("India", 45);
        hm.put("America", 30);
        hm.put("China", 2);
        hm.put("pakistan" , 0);
        System.out.println(hm);

        //Get operation is used to get the value by putting key in the operation

        int result = hm.get("India");
        System.out.println(result);

        System.out.println(hm.get("Indonesia"));

        //ContainsKey operation is used when to check whether the iteration contains key or not.
        //It returns boolean answers

        System.out.println(hm.containsKey("India"));

        //Remove removes the key and value both but it also returns the value if you print it
        int rm = hm.remove("pakistan");
        System.out.println(rm);

        System.out.println(hm);

        //size() - shows the size of the datastructure 
        System.out.println(hm.size());

        //Is Empty - Its used to clear the whole thing
        hm.clear();

        System.out.println(hm.isEmpty());
    }
}
