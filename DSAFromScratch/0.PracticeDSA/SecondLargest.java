import java.util.Scanner;

public class SecondLargest {

    public static void secondLarge(int arr[]){
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] != largest){
                secLargest = arr[i];
            }
        }
        System.out.println("The largest is : " +largest);
        System.out.print("The secLargest is : " +secLargest);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the array : ");
       int arr[] = new int[9];
       for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
       }
       sc.close(); 
       secondLarge(arr);
    }
}
