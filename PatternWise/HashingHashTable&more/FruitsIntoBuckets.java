import java.util.HashMap;

public class FruitsIntoBuckets {

    public static int falFruit(int fruits[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxlen = 0;
        int left = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                if (map.get(fruits[left]) == 1) {
                    map.remove(fruits[left]);
                } else {
                    map.put(fruits[left], map.get(fruits[left]) - 1);
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int fruits[] = { 1, 2, 3, 2, 2 };
        System.out.println(falFruit(fruits));
    }
}
