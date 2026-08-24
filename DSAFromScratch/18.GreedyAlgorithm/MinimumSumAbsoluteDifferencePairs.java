import java.util.Arrays;

public class MinimumSumAbsoluteDifferencePairs {

    public static int absoluteSum(int arr1[] , int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int MinSum = 0;
        for(int i = 0; i < arr1.length; i++){
           MinSum += Math.abs(arr1[i] - arr2[i]);
        }
        return MinSum;
    }

    public static void main(String[] args) {
        int arr1[] = {1 , 2 , 3};
        int arr2[] = {2 , 1 , 3};

        System.out.println(absoluteSum(arr1, arr2));
    }
}
