public class FindMinInRotatedAndSortedArray {

    public static int searchMinInRotSorArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] > arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int arr[] = { 3 , 4 , 5 , 6 , 0 , 1 , 2 };
        System.out.println(searchMinInRotSorArray(arr));
    }
}
