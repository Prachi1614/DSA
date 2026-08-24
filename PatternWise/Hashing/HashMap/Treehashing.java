import java.util.*;
public class Treehashing {

    // Treemap sorts the elements internally during the implemantation and therefore it provides the output in sorted order.
    // Due to the sorting its time complexity comes out to be O(log n).
    public static void main(String[] args) {
        TreeMap <String , Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("USA", 50);
        tm.put("Indonesia", 5);

        System.out.println(tm);
    }
}
