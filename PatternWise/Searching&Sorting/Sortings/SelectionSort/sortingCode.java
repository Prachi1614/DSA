public class sortingCode {

    public static void selectionCodeSort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minpos] > nums[j]) {
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
        int nums[] = { 5, 4, 1, 3, 2 };
        selectionCodeSort(nums);
        print(nums);
    }
}
