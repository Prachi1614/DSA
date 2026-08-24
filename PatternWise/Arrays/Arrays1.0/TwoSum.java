public class TwoSum {

    public static int[] twoSumming(int arr[] , int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == target && i != j){
                   return new int[]{i , j};
                }
            }
        }
        return new int[]{-1 , -1};
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 7 , 11 , 15 };
        int ans[] = twoSumming(arr, 9);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
