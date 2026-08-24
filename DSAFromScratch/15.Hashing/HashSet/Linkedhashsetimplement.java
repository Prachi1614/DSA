import java.util.*;;
public class Linkedhashsetimplement {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Pune");
        lhs.add("Bengaluru");
        lhs.add("Hydrabad");
        lhs.add("Mumbai");

        System.out.println(lhs);

        //Time complexity - O(n)
    }
}
