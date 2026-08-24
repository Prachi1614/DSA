import java.util.*;

public class ContainerWithMaxWater {

    public static int containerWMW(ArrayList<Integer> list1) {
        int maxWat = 0;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                int height = Math.min(list1.get(i), list1.get(j));
                int width = j - i;
                int currWat = height * width;
                maxWat = Math.max(maxWat, currWat);
            }
        }
        return maxWat;
    }

    // Two Pointer Approach
    public static int optimizedContainer(ArrayList<Integer> list1) {
        int maxWater = 0;
        int lp = 0;
        int rp = list1.size() - 1;

        while (lp < rp) {
            int ht = Math.min(list1.get(lp), list1.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if (list1.get(lp) < list1.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(8);
        list1.add(6);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        list1.add(8);
        list1.add(3);
        list1.add(7);
        System.out.println(containerWMW(list1));
        // System.out.println(optimizedContainer(list1));
    }
}
