import java.util.Scanner;

public class ReverseAnArray {

    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
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
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the array : " );
       int arr[] = new int[6];

       for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
       }
       
       reverseArray(arr);
       print(arr);
       sc.close(); 
    }
}
