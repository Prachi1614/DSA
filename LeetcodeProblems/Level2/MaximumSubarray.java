public class MaximumSubarray {

    public static int maximumSum(int arr[]){
        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        
        for(int i = 0; i < arr.length; i++){
            maxSum += arr[i];
            max = Math.max(maxSum , max);

            if(maxSum < 0){
                maxSum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , -3 , -4 , -5};
        System.out.println(maximumSum(arr));
    }
}
