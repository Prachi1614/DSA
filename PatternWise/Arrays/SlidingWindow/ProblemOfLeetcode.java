package SlidingWindow;

public class ProblemOfLeetcode {

    public static int AvgSubarrayThreshold(int arr[] , int k , int threshold){
        int count = 0;
        int currSum = 0;
        int target = threshold*k;
        
        for(int i = 0; i < k; i++){
            currSum += arr[i];
        }
        if(currSum >= target){
            count++;
        }
        
        for(int i = k; i < arr.length; i++){
           currSum += arr[i] - arr[i - k];
           if(currSum >= target){
            count++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        System.out.println(AvgSubarrayThreshold(arr, k, threshold));
    }
}
