public class ProductArrayExceptItself {

    public static int[] productExceptOwn(int nums[]){
        int ans[] = new int[nums.length];
        ans[0] = 1;
        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i - 1]*nums[i - 1];
        }
        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            ans[i] = ans[i]*suffix;
            suffix *= nums[i];
        }
        return ans;
    }

    public static void print(int ans[]){
       for(int i = 0; i < ans.length; i++){
        System.out.print(ans[i] + " ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {1 , 2 , 3 , 4};
        int result[] = productExceptOwn(nums);
        print(result);
    }
}
