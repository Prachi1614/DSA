import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean findDuplicate(int arr[]){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i + 1]){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 1 , 6 , 7 , 6 , 8 , 9 , 8};
        System.out.println(findDuplicate(arr));
    }
}
