package TwoPointer;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static int[] squares(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int arr1[] = new int[arr.length];
        int pos = arr.length - 1;

        while (i <= j) {
            int left = arr[i] * arr[i];
            int right = arr[j] * arr[j];

            if (left > right) {
                arr1[pos--] = left;
                i++;
            } else {
                arr1[pos--] = right;
                j--;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        int result[] = squares(arr);
        System.out.println(Arrays.toString(result));    
    }
}
