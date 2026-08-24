public class MaxSubArraySum {

    public static int maxSumSubarray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {1 , -2 , 6 , -1 , 3};

        System.out.println(maxSumSubarray(arr));
    }
}
