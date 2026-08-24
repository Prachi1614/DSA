package TwoPointer;

public class MoveZeroes {
    public static int[] moveZ(int nums[]){
        int i = 0; 
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
              nums[i] = nums[j];
              i++;
            }
        }
        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
        return nums;
    }
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {0 , 1, 0 , 3 , 12};
        moveZ(nums);
        print(nums);
    }
}
