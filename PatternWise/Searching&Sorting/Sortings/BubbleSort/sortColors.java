public class sortColors {

    public static void sortballColors(int nums[]) {
        int n = nums.length;
        int swap = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                swap++;
            }
        }
        System.out.println("The swaps are : " + swap);
    }
    
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 0, 0, 1, 2, 1 };
        sortballColors(nums);
        print(nums);
    }
}
