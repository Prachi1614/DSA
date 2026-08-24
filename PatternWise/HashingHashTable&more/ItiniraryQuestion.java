import java.util.HashMap;

public class ItiniraryQuestion {
    public static String itinarary(HashMap<String, String> tickets) {
        HashMap<String, String> revmap = new HashMap<>();

        for (String str : tickets.keySet()) {
            revmap.put(tickets.get(str), str);
        }

        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = itinarary(tickets);
        System.out.print(start);

        for (String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
