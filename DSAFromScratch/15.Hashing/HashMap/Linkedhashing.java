import java.util.*;
public class Linkedhashing {

    // LinkedHashMap is used if we want the output in sequence it uses doubly linkedList to print the desired output.
    public static void main(String[] args) {
       LinkedHashMap  <String , Integer> lhm = new LinkedHashMap<>();

       lhm.put("India", 100);
       lhm.put("China", 150);
       lhm.put("USA", 50);

       System.out.println(lhm);
       // It will provide me the output in the way I have put It In the input 
    }
}
