public class MaximumcircularSubarraySum {

    public static int maximumcircSum(int arr[]){
        int totalSum = 0;
        int maxSum = arr[0] , minSum = arr[0];
        int currMax = 0 , currMin = 0;

        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
            currMax = Math.max(currMax + arr[i] , arr[i]);
            maxSum = Math.max(currMax, maxSum);

            currMin = Math.min(currMin + arr[i] , arr[i]);
            minSum = Math.min(currMin, minSum);

            if(maxSum < 0){
                return maxSum;
            }
        }
        return Math.max(maxSum, totalSum - minSum);
    }
    public static void main(String[] args) {
        int arr[] = {1 , -2 , 3 , -2};
        System.out.println(maximumcircSum(arr));
    }
}
