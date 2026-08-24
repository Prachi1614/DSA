package SlidingWindow;

public class GrumpyBookstoreOwner {

    public static int grumpyArray(int nums[] , int []grumpy , int minutes){
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(grumpy[i] == 0){
               ans += nums[i];
            }
        }
        
        int unsatisfied = 0;
        for(int i = 0; i < minutes; i++){
            if(grumpy[i] == 1){
                unsatisfied += nums[i];
            }
        }

        int addcustomers = unsatisfied;
        for(int i = minutes; i < n; i++){
            if(grumpy[i] == 1){
                unsatisfied += nums[i];
            }
            if(grumpy[i - minutes] == 1){
                unsatisfied -= nums[i-minutes];
            }

            addcustomers = Math.max(unsatisfied , addcustomers);
        }
        return ans + addcustomers;
    }
    public static void main(String[] args) {
        int nums[] = {1 , 0 , 1 , 2 , 1 , 1 , 7 , 5};
        int grumpy[] = {0 , 1 , 0 , 1 , 0 , 1 , 0 , 1};
        int minutes = 3;
        System.out.println(grumpyArray(nums, grumpy, minutes));
    }
}
