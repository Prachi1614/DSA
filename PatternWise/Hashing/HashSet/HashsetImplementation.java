import java.util.*;
public class HashsetImplementation {
    public static void main(String[] args) {
        //HashSets are implemented from HashMaps , TreeSets are implemented from TreeMaps and LinkedSets are Implemented from LinkedMaps.
        //HashSets contains unique Values.
        //It's unordered.
        
        //HashSet <Integer> hs = new HashSet<>();
        //Time Complexity 

        //add(Key) - O(1);
        //contains(Key) - O(1);
        //remove(Key) - O(1);
        
        HashSet <Integer> hs = new HashSet<>();
        
        //Operations.

        //add operation
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(5);
        hs.add(1);
        hs.add(2);

        System.out.println(hs);
        
        //contains operations
        if(hs.contains(2)){
            System.out.println("hs contains 2");
        }

        //remove operation
        hs.remove(1);
        System.out.println(hs);

        //Size check
        System.out.println(hs.size());

        //clear HashSet
        hs.clear();
        System.out.println(hs);
        
        //isEmpty() method
        System.out.println(hs.isEmpty());
    }
}
