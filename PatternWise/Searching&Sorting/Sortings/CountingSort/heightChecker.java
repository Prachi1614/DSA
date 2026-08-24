public class heightChecker {

    public static int checkHeight(int nums[]){
        int n = nums.length;

        int length = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
           length = Math.max(length, nums[i]);
        }

        int arr1[] = new int[length + 1];
        for(int i = 0; i < n; i++){
            arr1[nums[i]]++;
        }

        int count = 0;
        int j = 0;
        for(int i = 0; i < arr1.length; i++){
            while(arr1[i] > 0){
                if(i != nums[j]){
                    count++;
                }
                j++;
                arr1[i]--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {5 , 3 , 2 , 4 , 1};
        System.out.println(checkHeight(nums));
    }
}
