public class BinarySearch {

    public static int binSearch(int arr[] , int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        System.out.println(binSearch(arr, 9));
    }
}
