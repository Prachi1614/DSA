public class SortingCode {

    public static void insertionCoding(int nums[]){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int curr = nums[i];
            int prev = i - 1;

            while(prev >= 0 && nums[prev] > curr){
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
           System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = { 5 , 4 , 1 , 3 , 2 };
        insertionCoding(nums);
        print(nums);
    }
}
