public class MaximumAbsoluteSumOfAnySubarray {

    public static int maxSubarray(int arr[]) {
        int maxSum = 0, minSum = 0, prefix = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            maxSum = Math.max(maxSum, prefix);
            minSum = Math.min(minSum, prefix);
        }
        return maxSum - minSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -3, 2, 3, -4 };
        System.out.println(maxSubarray(arr));
    }
}
