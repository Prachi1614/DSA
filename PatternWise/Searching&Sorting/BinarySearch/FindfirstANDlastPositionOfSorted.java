package BinarySearch;

import java.util.Arrays;

public class FindfirstANDlastPositionOfSorted {

    public int[] searchRange(int nums[], int target) {
        int first = firstPlace(nums, 8);
        int last = lastPlace(nums, 8);

        return new int[] { first, last };
    }

    private static int firstPlace(int nums[], int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static int lastPlace(int nums[], int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FindfirstANDlastPositionOfSorted sol = new FindfirstANDlastPositionOfSorted();
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        int [] result = sol.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
