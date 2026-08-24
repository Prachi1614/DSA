package BinarySearch;

public class SearchInsertPosition {

    public static int searchPosition(int nums[] , int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int nums[] = {1 , 3 , 5 , 6};
        System.out.println(searchPosition(nums, 2));
    }
}
