public class SortAnArrayTLE {

    public static void selectionCodeSort(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minpos]) {
                    minpos = j;
                }
            }
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { -1 , 2 , -8 , 3 , -10 };
        selectionCodeSort(nums);
        print(nums);
    }
}
