public class ProductOfArrayExceptSelf {

    public static int[] productOfArraySelf(int arr[]){
        int n = arr.length;

        int ans[] = new int[n];
        ans[0] = 1;
        for(int i = 1; i < n; i++){
           ans[i] = ans[i - 1]*arr[i - 1];
        }

        int suffix = 1;
        for(int i = n - 2; i >= 0; i--){
            suffix *= arr[i + 1];
            ans[i] *= suffix;
        }
        return ans;
    } 
    public static void main(String[] args) {
        int nums[] = { 1 , 2 , 3 , 4 };
        int ans[] = productOfArraySelf(nums);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
