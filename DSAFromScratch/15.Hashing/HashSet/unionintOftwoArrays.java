import java.util.*;

public class unionintOftwoArrays {

    public static void unionAndIntersectionOfArray(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        System.out.print("The union is : ");
        for (Integer val : hs) {
            System.out.print(val + " ");
        }
        System.out.println();

        hs.clear();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        System.out.print("The intersection is : ");
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
            }
            hs.remove(arr2[i]);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        unionAndIntersectionOfArray(arr1, arr2);
    }
}
