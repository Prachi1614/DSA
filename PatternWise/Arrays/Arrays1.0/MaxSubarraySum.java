public class MaxSubarraySum {

    public static void maxSubArray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxsum < currSum) {
                    maxsum = currSum;
                }
            }
        }
        System.out.println("maxsum : " + maxsum);
    }

    public static void maxSumOnce(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                   currSum += arr[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSumOnce(arr);
    }
}
