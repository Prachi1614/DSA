public class SearchInRotatedAndSoretdArray {

    public static int recursiveSearch(int arr[] , int si, int ei , int tar){
         
        if(si > ei){
            return -1;
        }
        
        int mid = si + (ei - si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        if(arr[si] <= arr[mid]){
            //case a : 
            if(arr[si] <= tar && tar <= arr[mid]){
               return recursiveSearch(arr, si, mid, tar);
            }
            //case b :
            else{
                return recursiveSearch(arr, mid+1, ei, tar);
            }
        }
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return recursiveSearch(arr, mid+1, ei, tar);
            }
            else{
                return recursiveSearch(arr, si, mid - 1, tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 4 , 5 , 6 , 0 , 1 , 2 , 3 };
        System.out.println(recursiveSearch(arr, 0, arr.length - 1, 2));
    }
}
