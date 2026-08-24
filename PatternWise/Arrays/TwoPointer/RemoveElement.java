package TwoPointer;

public class RemoveElement {

    public static int removeUnwanted(int nums[] , int target){
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != target){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int nums[] = {0 , 1 , 2 , 2 , 3 , 0 , 4 , 2};
        System.out.println(removeUnwanted(nums, 2));
    }
}
