public class SortingCode {

    public static void countSorting(int nums[]){
        int n = nums.length;

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest + 1];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                nums[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public static void print(int count[]){
        for(int i = 0; i < count.length; i++){
            System.out.print(count[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = { 0 , 8 , 0 , 2 , 5 , 5 , 7 , 4 , 3 , 1 , 2 , 1};
        countSorting(nums);
        print(nums);
    }
}
