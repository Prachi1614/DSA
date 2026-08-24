import java.util.*;

public class CountDistinctElements {

    public static int countDis(int nums[]) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 2, 3, 2, 4, 1 , 6 };
        System.out.println(countDis(nums));
    }
}
