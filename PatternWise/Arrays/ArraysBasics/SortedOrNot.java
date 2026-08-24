public class SortedOrNot {

    public static boolean isSortArray(int arr[]){
        int start = 0; 
         
        while(start < arr.length - 1){
            if(arr[start] > arr[start+1]){
                return false;
            }
            start++;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 4, 4};
        System.out.println(isSortArray(arr));
    }
}
