package BinarySearch;

public class PeakMountaiElement {

    public static int peakValue(int nums[]){
        int n = nums.length;
        int start = 1;
        int end = n - 2;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]){
                return nums[mid];
            }
            else if(nums[mid - 1] < nums[mid]){
               start = mid + 1; 
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {0 , 1 , 1 , 4 , 3 , 2 , 1};
        System.out.println(peakValue(nums));
    }
}
