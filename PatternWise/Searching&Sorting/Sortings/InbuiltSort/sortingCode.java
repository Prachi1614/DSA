import java.util.*;
public class sortingCode {

    public static void print(Integer nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer nums[] = { 4 , 5 , 3 , 1 , 2};
        // Arrays.sort(nums);
        // Arrays.sort(nums , 0 , 3 );
        // Arrays.sort(nums , Collections.reverseOrder());
        Arrays.sort(nums , 0 , 3 , Collections.reverseOrder());
        print(nums);
    } 
}
