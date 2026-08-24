public class RunningSumOf1DArray {

    public static int[] runningSum(int nums[]) {

        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    public static void print(int prefix[]) {
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1, 1 };
        int prefix[] = runningSum(nums);
        print(prefix);
    }
}

