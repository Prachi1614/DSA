public class LargestNumber {

    public static int largestInArray(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(smallest > arr[i]){
               smallest = arr[i];
            }
        }
        System.out.println("Smallest Number is : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2 , 8000 , 900 , 5 , 6 , 123};
        System.out.println("Largest number is : "+largestInArray(arr));
        
    }
}
