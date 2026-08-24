package SlidingWindow;

public class FirstNegativeElement {

    public static long[] firstNegEl(long nums[] , int k){
        int n = nums.length;
        long arr[] = new long[n - k + 1];

        for(int i = 0; i <= n - k; i++){
           
            long ans = 0;
            for(int j = i; j < i + k; j++){
                if(nums[j] < 0){
                    ans = nums[j];
                    break;
                }
            }
            arr[i] = ans;
        }
        return arr;
    }

    public static void print(long nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        long nums[] = {-1 , -4 , 8 , -3 , 2 , -1 , -1 , 0};
        long res[] = firstNegEl(nums, 4);
        print(res);

    }
}
