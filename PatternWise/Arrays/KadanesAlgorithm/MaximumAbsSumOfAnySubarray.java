package KadanesAlgorithm;

public class MaximumAbsSumOfAnySubarray {

    public static int absSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                maxSum = Math.max(maxSum, Math.abs(sum));
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, -5, 1, -4, 3, -2 };
        System.out.println(absSubarraySum(arr));
    }
}
