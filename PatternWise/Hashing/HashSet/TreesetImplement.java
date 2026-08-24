import java.util.*;
public class TreesetImplement {
    public static void main(String[] args) {
        TreeSet <String> ts = new TreeSet<>();

        ts.add("Mumbai");
        ts.add("Pune");
        ts.add("Delhi");
        ts.add("Banglore");
        ts.add("Los Anjelis");

        System.out.println(ts);

        //Treeset doestn't entertain null values.
        //Time complexity - O(log n)
    }
}
