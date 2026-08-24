public class CheckIfSorted {

    public static boolean isSorted(int arr[]){

        boolean isAscending = true;
        boolean isDescending = true;

        int start = 0;

        while(start < arr.length - 1){
            if(arr[start] > arr[start + 1]){
                isAscending = false;
            }

            if(arr[start] < arr[start + 1]){
                isDescending = false;
            }
            start++;
        }
        return isAscending || isDescending;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5 , 6 , 7};
        int arr1[] = {1 , 2 , 8 , 4 , 5 , 6 , 7};
        int arr2[] = {2 , 2 , 2};
        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr));
        System.out.println(isSorted(arr2));
    }
}
