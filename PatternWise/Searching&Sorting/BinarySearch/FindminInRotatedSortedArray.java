package BinarySearch;

public class FindminInRotatedSortedArray {

    public static int findMin(int nums[]){
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return nums[start];
    }
    public static void main(String[] args) {
        int nums[] = {11 , 6 , 7 , 8 , 9 , 10};
        System.out.println(findMin(nums)); 
    }
}
