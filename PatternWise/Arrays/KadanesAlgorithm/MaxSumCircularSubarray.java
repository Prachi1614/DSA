package KadanesAlgorithm;

public class MaxSumCircularSubarray {

    public static int bruteForce(int arr[]){
        int n = arr.length;
        int ms = Integer.MIN_VALUE;
        

        for(int i = 0; i < n; i++){
            int cs = 0;
            for(int j = 0; j < n; j++){

                int index = (i + j)%n;
                
                cs += arr[index];

                ms = Math.max(cs, ms);
            }
        }
        return ms;
    }

    public static int maxCircularSum(int nums[]){
        int n = nums.length;

        int maxsum = Integer.MIN_VALUE;
        int currmax = 0;

        int minsum = Integer.MAX_VALUE;
        int currmin = 0;

        int totalSum = 0;

        for(int i = 0; i < n; i++){
            totalSum += nums[i];

            currmax = Math.max(nums[i] , currmax+nums[i]);
            maxsum = Math.max(maxsum , currmax);

            currmin = Math.min(nums[i] , currmin+nums[i]);
            minsum = Math.min(minsum , currmin);
        }

        if(maxsum < 0){
            return maxsum;
        }
        return Math.max(maxsum , totalSum - minsum);
    }
    public static void main(String[] args) {
        // int nums[] = {1 , -2 , 3 , -2};
        // System.out.println(maxCircularSum(nums));

        int arr[] = {1 , -2 , 3 , -2 , 4 , 7 , 9};
        System.out.println(bruteForce(arr));
    }
}
