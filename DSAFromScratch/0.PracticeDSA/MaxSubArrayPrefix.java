public class MaxSubArrayPrefix {

    public static int prefixSubarraySum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                maxsum = Math.max(currsum, maxsum);
            }  
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {1 , -2 , 6 , -1 , 3};
        System.out.println(prefixSubarraySum(arr));
    }
}
