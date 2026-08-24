public class BinarySearch {

    public static int binSearch(int arr[] , int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 5 , 8 , 90};
        int key = 1;

        System.out.println(binSearch(arr, key));
    }
}
