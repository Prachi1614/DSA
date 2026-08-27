public class FindPivotPoint {

    public static int pivotPoint(int arr[]){
        int n = arr.length;
        int totalSum = 0;
        for(int i = 0; i < n; i++){
           totalSum += arr[i];
        }

        int leftSum = 0;
        for(int i = 0; i < n; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 7 , 3 , 6 , 5 , 6};
        System.out.println(pivotPoint(arr));
    }
}
