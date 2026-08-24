public class PrefixSumRunning1D {

    public static void Running1D(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
    }

    public static void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        Running1D(nums);
        print(nums);
    }
}
