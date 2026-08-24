package BinarySearch;

public class SearchInAlmostSortedArray {

    public static int searchAlmostSorted(int nums[] , int target){
        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(mid - 1 >= start && nums[mid - 1] == target){
                return mid - 1;
            }
            if(mid + 1 <= end && nums[mid + 1] == target){
                return mid + 1;
            }
            else if(nums[mid] < target){
                start = mid + 2;
            }
            else {
                end = mid - 2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {10 , 3 , 40 , 20 , 80 , 70};
        System.out.println(searchAlmostSorted(nums, 70));
    }
}
