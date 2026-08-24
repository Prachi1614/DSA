package TwoPointer;

import java.util.Arrays;

public class TwoSum2 {

    public static int[] twoSumque(int arr[] , int target){
        int i = 0; 
        int j = arr.length - 1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{i+1 , j+1};
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1 , -1};
    }
    public static void main(String[] args) {
        int arr[] = {2 , 7 , 11 , 15};
        System.out.println(Arrays.toString(twoSumque(arr, 9)));
    }
}
