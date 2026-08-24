import java.util.Scanner;

public class LargestInArray {

    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];   
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        System.out.print("Enter the number : " );

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int large = largestNum(arr);
        System.out.println("The biggest number is : " + large);
    }
}
