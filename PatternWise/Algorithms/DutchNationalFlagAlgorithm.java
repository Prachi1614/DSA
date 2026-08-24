package Algorithms;

public class DutchNationalFlagAlgorithm {

    public static void mostOptimized(int nums[]){
        int mid = 0;
        int low = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums , low , mid);
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid , high);
                high--;
            }
        }
    }
    private static void swap(int nums[] , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {1 , 1 , 2 , 0 , 2 , 0 , 0 , 2 , 1 , 2 , 1};
        mostOptimized(nums);
        print(nums);
    }
}
