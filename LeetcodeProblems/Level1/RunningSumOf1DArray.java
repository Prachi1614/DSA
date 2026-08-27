public class RunnySumOf1DArray {

    public static void runningSum(int arr[]){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i ++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for(int i = 0; i < prefix.length; i++){
            System.out.print(prefix[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1 , 1 , 1 , 1};
        runningSum(arr);
    }
}
