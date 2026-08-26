public class ConcatenationOfArray {

    public static int[] concatenate(int arr[]){
        int n = arr.length;
        int arr1[] = new int[2*n];
        
        for(int i = 0; i < n; i++){
            arr1[i] = arr[i];
            arr1[n+i] = arr[i];
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 1};
        int res[] = concatenate(arr);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");   
        }
        System.out.println();
    }
}
