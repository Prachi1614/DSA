package BinarySearch;

public class ConcatenationOfArray {

    public static int[] addTwoarrays(int nums[]){
        int n = nums.length;

        int ans[] = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[n+i] = nums[i];
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
        int nums[] = {1 , 2 , 3 , 4 , 5};
        int ans[] = addTwoarrays(nums);
        print(ans);
    }
}
