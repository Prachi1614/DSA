import java.util.*;
public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet <String> cities  = new HashSet<>();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Lucknow");
        cities.add("Gujarat");
        cities.add("Banglore");
        
        // Iterator i = cities.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        for(String city : cities){
            System.out.println(city);
        }
    }
}
