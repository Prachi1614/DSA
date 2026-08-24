public class FindMaxAndMin1 {
     
    public static void maxAndmin(int arr[]){
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr.length == 1){
                System.out.println("The max and the min element in an array is :" +arr[i]);
            }

            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The maximum element in the array is : " + max);
        System.out.println("The minimum element in the array is : " + min);
    }

    public static void main(String[] args) {
       int arr[] = {-7 , -2 , -9 , -4 , -1};
       int arr1[] = {7 , 1};
       maxAndmin(arr);
       maxAndmin(arr1);
    }
}
