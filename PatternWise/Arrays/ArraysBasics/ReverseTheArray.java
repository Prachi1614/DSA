public class ReverseTheArray {

    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7 , 2 , 9 , 4 , 6 , 1};
        int arr1[] = {1};
        reverse(arr1);
        print(arr1);
    }
}
