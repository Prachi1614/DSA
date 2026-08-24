public class SortedAndRotatedArray {

    public static int sortedAndRotated(int arr[] , int si , int ei , int tar){
        if(si > ei){
            return -1;
        }
        //For finding out the mid.
        int mid = si + (ei - si)/2;
        
        //CASE FOUND
        if(tar == arr[mid]){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //Case a:Left
            if(arr[si] <= tar && tar <= arr[mid]){
                return sortedAndRotated(arr, si, mid - 1, tar);
            }
            else{
                return sortedAndRotated(arr, mid + 1, ei, tar);
            }
        }
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return sortedAndRotated(arr, mid+1, ei, tar);
            }
            else{
                return sortedAndRotated(arr, si, mid - 1, tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4 , 5 , 6 , 7 , 0 , 1 , 2};
        int target = 6;
        int taridx = sortedAndRotated(arr, 0, arr.length - 1, target);
        System.out.println(taridx);
    }
}
