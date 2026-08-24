package BinarySearch;

public class FindNumbersWithEvenNoOfDigits {

    public static int evenNoDigits(int nums[]){
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            int digits = 0;

            while(nums[i] > 0){
                digits++;

                nums[i] /= 10;
            }

            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(evenNoDigits(nums));
    } 
}
