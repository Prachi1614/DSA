public class MaximumSubarrayAvgI {

    public static double maximumAvg(int arr[] , int k){
        int left = 0;
        int right = 0;
        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        while (right < arr.length) {
            currSum += arr[right];
            right++;
            int window = right - left;
            if(window == k){
                maxsum = Math.max(maxsum, currSum);
                currSum -= arr[left];
                left++;
            }
        }
        return (double) maxsum / k;
    }
    public static void main(String[] args) {
        int arr[] = {1,12,-5,-6,50,3};
        System.out.println(maximumAvg(arr, 4));
    }
}
