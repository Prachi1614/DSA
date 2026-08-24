public class prefixSum {

    public static void prefixAdd(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int Prefix[] = new int[arr.length];
        Prefix[0] = arr[0];

        for(int i = 1; i < Prefix.length; i++){
            Prefix[i] = Prefix[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                currSum = i == 0 ? Prefix[j] : Prefix[j] - Prefix[i - 1];
            }
            if(maxSum < currSum){
               maxSum = currSum;
            }
        }
        System.out.println("Max : " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefixAdd(arr);
    }
}
