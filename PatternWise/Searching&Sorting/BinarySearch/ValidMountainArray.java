package BinarySearch;

class ValidMountainArray {

    public static boolean mountainValid(int arr[]){
        int n = arr.length;
        
        if(n < 3){
            return false;
        }
        int i = 1;
        while(i < n && arr[i - 1] < arr[i]){
            i++;
        }

        if(i == 1 || i == n){
            return false;
        }

        while(i < n && arr[i] < arr[i - 1]){
            i++;
        }
        return i == n;
    }
    public static void main(String[] args) {
        int arr[] = {0 , 2};
        System.out.println(mountainValid(arr));
    }
}