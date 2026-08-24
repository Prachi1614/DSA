import java.util.Scanner;

public class LinearSearch {

    public static int linearSearching(int arr[] , int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array : " );
        int arr[] = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int index = linearSearching(arr, 7);
        System.out.println(index);

        if(index == -1){
        System.out.println("Not found target");
        }
        else{
            System.out.println("The target is at index : " +index);
        }
    }
}
